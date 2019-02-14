package cubex.mahesh.toolbar_menu_feb19

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    supportActionBar?.setTitle("Welcome 2 NIT...")
       setSupportActionBar(tBar)
        tBar.search.setOnClickListener {
            Toast.makeText(this@MainActivity,
                    tBar.et1.text, Toast.LENGTH_LONG).show()
        }

        tBar.next.setOnClickListener {
            var i = Intent(this@MainActivity,
                            WelcomeActivity::class.java)
            startActivity(i)
        }


    } // onCreate
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
     menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        Toast.makeText(this@MainActivity,
            item?.title , Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}
