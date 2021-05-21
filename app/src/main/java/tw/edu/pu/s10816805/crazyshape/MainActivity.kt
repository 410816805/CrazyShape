package tw.edu.pu.s10816805.crazyshape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main.*
@GlideModule
public final class MyAppGlideModule : AppGlideModule()


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val img: ImageView = findViewById(R.id.imgTitle)
        GlideApp.with(this)
            .load(R.drawable.cover)
            .circleCrop()
            .override(800, 600)
            .into(img)


        Toast.makeText(baseContext, "作者：李瑜玲", Toast.LENGTH_LONG).show()

        imgNext.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?){
                var X: Int = (0..3).random() //目前顯示第幾張圖
                var TotalPictures: Int = 4
                fun ShowPicture() {
                    when (X) {
                        0 -> img.setImageResource(R.drawable.circle)
                        1 -> img.setImageResource(R.drawable.square)
                        2 -> img.setImageResource(R.drawable.star)
                        3 -> img.setImageResource(R.drawable.triangle)

                    }
                }
                X = X
                ShowPicture()





                /*imgNext.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?): Boolean {
                intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)
                return true
            }
        })*/
            }
        })
    }
}
