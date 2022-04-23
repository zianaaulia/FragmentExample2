package zianaaulia.polbeng.ac.id.fragmentexample2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.book_titles.*

class BookTitle: Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.book_titles, container, false)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rlass3.setOnClickListener(this)
        rlass3kotlin.setOnClickListener(this)
        rminandroid.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var index: Int = 0
        when(v?.id){
            R.id.rlass3 -> {
                index = 0
            }
            R.id.rlass3kotlin -> {
                index = 1
            }
            R.id.rminandroid -> {
                index = 2
            }
        }
        val activity = getActivity()
        if (activity is Coordinator) {
            activity.onBookChanged(index)
        }
    }
}