package com.lakue.oburie.utils.loading

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {

    companion object {

        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T?): Resource<T> {
            return Resource(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }

        fun <T> timeoutError(): Resource<T> {
            return Resource(Status.TIMEOUT_ERROR, null, null)
        }

        fun <T> networtError(): Resource<T> {
            return Resource(Status.NETWORK_ERROR, null, null)
        }

    }

}