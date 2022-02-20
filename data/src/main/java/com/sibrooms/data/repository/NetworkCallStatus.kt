package com.sibrooms.data.repository

data class NetworkCallStatus<out T>(val status: Status, val data: T?, val message: String?) {
    enum class Status {
        SUCCESS,
        LOADING,
        ERROR,
        NO_DATA
    }

    companion object {
        fun <T> success(data: T): NetworkCallStatus<T> {
            return NetworkCallStatus(Status.SUCCESS, data, null)
        }

        fun <T> loading(data: T): NetworkCallStatus<T> {
            return NetworkCallStatus(Status.LOADING, data, null)
        }

        fun <T> error(data: T): NetworkCallStatus<T> {
            return NetworkCallStatus(Status.ERROR, data, error(data).toString())
        }

        fun <T> noData(data: T): NetworkCallStatus<T> {
            return NetworkCallStatus(Status.NO_DATA, data, null)
        }
    }
}