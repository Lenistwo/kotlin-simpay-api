package utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient

private const val GET_IP_URL = "https://simpay.pl/api/get_ip"
private const val HTTP_OK_CODE = 200

class HttpService {
    private fun okHttp(): OkHttpClient {
        return OkHttpClient()
    }

    private fun gson(): Gson {
        return GsonBuilder().setPrettyPrinting().create()
    }


}
