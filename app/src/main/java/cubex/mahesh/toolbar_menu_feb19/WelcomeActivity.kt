package cubex.mahesh.toolbar_menu_feb19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        supportActionBar?.setHomeButtonEnabled(true)

    }
}
