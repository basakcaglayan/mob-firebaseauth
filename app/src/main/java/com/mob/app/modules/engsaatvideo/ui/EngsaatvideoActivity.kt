package com.mob.app.modules.engsaatvideo.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngsaatvideoBinding
import com.mob.app.modules.engsaategzersiz.ui.EngsaategzersizActivity
import com.mob.app.modules.engsaatvideo.`data`.viewmodel.EngsaatvideoVM
import kotlin.String
import kotlin.Unit

class EngsaatvideoActivity :
    BaseActivity<ActivityEngsaatvideoBinding>(R.layout.activity_engsaatvideo) {
  private val viewModel: EngsaatvideoVM by viewModels<EngsaatvideoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engsaatvideoVM = viewModel

    val videoView = findViewById<VideoView>(R.id.viewengsaatvideo) // VideoView'ı layout dosyanızda tanımladığınız id ile değiştirin
    val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.engsaatvideo)
    videoView.setVideoURI(videoUri)
    videoView.start()
  }

  override fun setUpClicks(): Unit {
    binding.linearThrough.setOnClickListener {
      val destIntent = EngsaategzersizActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGSAATVIDEO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngsaatvideoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
