package sd;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dramarush.shortin.R;
import ed.l0;
import hc.y0;
import zp.r;

/* JADX INFO: compiled from: VideoCommentPop.java */
/* JADX INFO: loaded from: classes3.dex */
public class i extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f79680a;

    /* JADX INFO: compiled from: VideoCommentPop.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f79681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0 f79682c;

        public a(TextView textView, y0 y0Var) {
            this.f79681b = textView;
            this.f79682c = y0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f79681b.getText().equals(r.b().getResources().getString(R.string.text_delete))) {
                b bVar = i.this.f79680a;
                if (bVar != null) {
                    bVar.a(this.f79682c, 1);
                    return;
                }
                return;
            }
            b bVar2 = i.this.f79680a;
            if (bVar2 != null) {
                bVar2.a(this.f79682c, 2);
            }
        }
    }

    /* JADX INFO: compiled from: VideoCommentPop.java */
    public interface b {
        void a(y0 y0Var, int i10);
    }

    public i(Context context, y0 y0Var) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_comment, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_content);
        if (y0Var.f63438c.getUser_id() == l0.T()) {
            textView.setText(r.b().getResources().getString(R.string.text_delete));
        } else {
            textView.setText(r.b().getResources().getString(R.string.text_report));
        }
        textView.setOnClickListener(new a(textView, y0Var));
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-2);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.white));
    }

    public void a(b bVar) {
        this.f79680a = bVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight(view.getResources().getDisplayMetrics().heightPixels - rect.bottom);
        super.showAsDropDown(view);
    }
}
