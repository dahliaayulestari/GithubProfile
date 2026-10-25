package dahlia.com.example.githubprofile.helpers

import dahlia.com.example.githubprofile.BuildConfig
class Config {
    companion object{
        const val SPLASH_SCREEN_DELAY = 10000L
        const val BASE_URL ="https://api.github.com"
        const val DEFAULT_USER_LOGIN = "dahliaayulestari"
        const val PERSONAL_ACCESS_TOKEN = "token ${BuildConfig.ACCESS_TOKEN}"
    }
}