package cz.tomasfanta.pomodoro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMe = findViewById<Button>(R.id.button)
        buttonClickMe.setOnClickListener{
            Toast.makeText(this@MainActivity, "You've clicked me", Toast.LENGTH_LONG).show()
        }
    }
}