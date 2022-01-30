package my.project.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import my.project.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindings: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        setListeners();

    }

    private fun setListeners() {
        val clicableViews: List<View> = listOf(
            bindings.boxOneText,
            bindings.boxTwoText,
            bindings.boxThreeText,
            bindings.boxFourText,
            bindings.boxFiveText,
            bindings.redButton,
            bindings.greenButton,
            bindings.yellowButton
        )
        for(item in clicableViews )
        {
            item.setOnClickListener{makeColored(it)}
        }
    }


    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background

            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> view.setBackgroundColor(Color.RED)
            R.id.yellow_button -> view.setBackgroundColor(Color.YELLOW)
            R.id.green_button -> view.setBackgroundColor(Color.GREEN)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}