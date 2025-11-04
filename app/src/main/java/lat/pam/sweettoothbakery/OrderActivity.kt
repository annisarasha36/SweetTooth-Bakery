package lat.pam.sweettoothbakery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Pindah ke halaman home
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.nav_order -> {
                    // Sudah di halaman Order
                    true
                }
                else -> false
            }
        }

        val btnBuatPesanan = findViewById<Button>(R.id.btnBuatPesanan)
        btnBuatPesanan.setOnClickListener {
            val intent = Intent(this, AlamatPemesananActivity::class.java)
            startActivity(intent)
        }
    }
}
