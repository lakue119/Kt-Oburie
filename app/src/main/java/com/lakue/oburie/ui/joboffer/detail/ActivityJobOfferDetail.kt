package com.lakue.oburie.ui.joboffer.detail

import android.content.Context
import android.content.Intent
import android.graphics.Color
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityJobOfferDetailBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ActivityJobOfferDetail  : BaseActivity<ActivityJobOfferDetailBinding, JobOfferDetailViewModel>(R.layout.activity_job_offer_detail),
    OnMapReadyCallback {

    lateinit var mMap: GoogleMap

    companion object {
        fun startJobOfferDetailActivity(
                context: Context
        ) {
            val intent = Intent(context, ActivityJobOfferDetail::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
        }
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }


    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        mMap = googleMap!!

        // Add a marker in Sydney and move the camera
        val location = LatLng(viewModel.liveJobOffer.value!!.lat, viewModel.liveJobOffer.value!!.lnt)
        mMap.addMarker(MarkerOptions()
            .position(location)
            .title("공연위치"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 14.0f));

        //거리 원 추가
        var circleLength = CircleOptions().center(location)
            .radius(500.0)   //반지름 = m
            .strokeWidth(2f)    //선너비 0f = 선없음
            .strokeColor(Color.parseColor("#0080FF"))
            .fillColor(Color.parseColor("#4D72B9FF"))  //배경색

        mMap.addCircle(circleLength)

    }
}