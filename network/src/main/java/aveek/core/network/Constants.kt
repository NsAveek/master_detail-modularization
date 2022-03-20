package aveek.core.network

import javax.inject.Inject

class ConstantsClass @Inject constructor(){

    enum class Constants{
        IS_LOGGED_IN,
        AUTH_TOKEN,
        USER_NAME

    }
}