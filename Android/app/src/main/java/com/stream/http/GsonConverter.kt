package com.stream.http

/**
 * @author haimian on 2021/11/29 0029
 */
import com.drake.net.convert.JSONConvert
import com.hjq.gson.factory.GsonFactory
import java.lang.reflect.Type

class GsonConverter : JSONConvert() {
    private val gson = GsonFactory.getSingletonGson()

    override fun <R> String.parseBody(succeed: Type): R? {
        return gson.fromJson(this, succeed)
    }
}