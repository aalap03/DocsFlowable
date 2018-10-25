package com.example.aalap.cobaltdocuments

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitCreator {

    fun retrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://org.e-cobalt.com")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(httpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun httpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(interceptor())
            .build()
    }

    private fun interceptor(): Interceptor {

        return Interceptor { chain ->
            val original = chain.request()
            val requestBuilder = original.newBuilder()
                .method(original.method(), original.body())

//            if(App().getToken().isNotEmpty())
                requestBuilder.header("Authorization", "bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MzgsInJvbGUiOnsibmFtZSI6IkNPQkFMVF9BRE1JTiIsImhpZGRlbiI6MCwicGVybWlzc2lvbnMiOlt7Im1vZHVsZU5hbWUiOiJBRE1JTiIsImFjY2Vzc1R5cGUiOiJydyJ9LHsibW9kdWxlTmFtZSI6IkJDTUdOVCIsImFjY2Vzc1R5cGUiOiJydyJ9LHsibW9kdWxlTmFtZSI6IkNIQVQiLCJhY2Nlc3NUeXBlIjoicncifSx7Im1vZHVsZU5hbWUiOiJJTkNJREVOVE1HTlQiLCJhY2Nlc3NUeXBlIjoicncifSx7Im1vZHVsZU5hbWUiOiJNT0JJTEVBQ0NFU1MiLCJhY2Nlc3NUeXBlIjoicncifSx7Im1vZHVsZU5hbWUiOiJNWUFDVElPTlMiLCJhY2Nlc3NUeXBlIjoicncifSx7Im1vZHVsZU5hbWUiOiJOT1RJRklDQVRJT04iLCJhY2Nlc3NUeXBlIjoicncifSx7Im1vZHVsZU5hbWUiOiJQUk9GSUxFIiwiYWNjZXNzVHlwZSI6InJ3In0seyJtb2R1bGVOYW1lIjoiUkVQT1JUSU5HIiwiYWNjZXNzVHlwZSI6InJ3In0seyJtb2R1bGVOYW1lIjoiUkVTRVQiLCJhY2Nlc3NUeXBlIjoicncifSx7Im1vZHVsZU5hbWUiOiJTRUNVUklUWU1HTlQiLCJhY2Nlc3NUeXBlIjoicncifSx7Im1vZHVsZU5hbWUiOiJTWU5DSFJPQ09OVEFDVFMiLCJhY2Nlc3NUeXBlIjoicncifSx7Im1vZHVsZU5hbWUiOiJTWU5DSFJPR1JPVVBTIiwiYWNjZXNzVHlwZSI6InJ3In0seyJtb2R1bGVOYW1lIjoiU1lOQ0hST05JWkFUSU9OIiwiYWNjZXNzVHlwZSI6InJ3In1dfSwidXNlcm5hbWUiOiJhYWxhcDAzIiwib3JnYW5pemF0aW9uSWQiOiJkdGxwMDAwMDAxMjM0NTYiLCJjc3JmVG9rZW4iOiJhMjcyMTE3MC03ZDU5LTRkNGUtOThmNS1iNDNiOGY2YTIzOTIiLCJzZWN1cml0eUFnZW50SWQiOjIsImNvbnRhY3RJZCI6MTU5LCJ1c2VyQWdlbnQiOiJDb2JhbHRfQW5kcm9pZCIsInVzZXJBZ2VudFZlcnNpb24iOiJWZXJzaW9uIDIuMC42IiwidXNlck9zIjoiQW5kcm9pZCIsInVzZXJPc1ZlcnNpb24iOiI3LjAiLCJqdGkiOiIzOC5kMTE5NGRiOS1lNDJlLTQ1ZDktODc0OS04Y2FjNmJkZWQ3MmUuMTU0MDQ5NDA5MCIsImlhdCI6MTU0MDQ5NDA5MCwiZXhwIjoxNTQwNTgwNDkwfQ.SrbkMOdCvuYLmjAjlRbPhBq8nbPHsh4HDuUz5UEzxXQ")

            requestBuilder.header("Origin", "https://localhost")

            chain.proceed(requestBuilder.build())
        }
    }
}