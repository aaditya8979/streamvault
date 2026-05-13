package sd;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dramarush.shortin.R;

/* JADX INFO: compiled from: EditMinePop.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f79609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f79610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f79611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f79612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f79613e;

    /* JADX INFO: renamed from: sd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EditMinePop.java */
    public class ViewOnClickListenerC0952a implements View.OnClickListener {
        public ViewOnClickListenerC0952a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
            d dVar = a.this.f79613e;
            if (dVar != null) {
                dVar.a(1);
            }
        }
    }

    /* JADX INFO: compiled from: EditMinePop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
            d dVar = a.this.f79613e;
            if (dVar != null) {
                dVar.a(2);
            }
        }
    }

    /* JADX INFO: compiled from: EditMinePop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: EditMinePop.java */
    public interface d {
        void a(int i10);
    }

    public a(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_edit_mine, (ViewGroup) null);
        this.f79609a = (LinearLayout) viewInflate.findViewById(R.id.ll_top);
        this.f79610b = (TextView) viewInflate.findViewById(R.id.tv_photo);
        this.f79611c = (TextView) viewInflate.findViewById(R.id.tv_camera);
        this.f79612d = (TextView) viewInflate.findViewById(R.id.tv_cancel);
        this.f79610b.setOnClickListener(new ViewOnClickListenerC0952a());
        this.f79611c.setOnClickListener(new b());
        this.f79609a.setOnClickListener(new c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background2));
    }

    public void a(d dVar) {
        this.f79613e = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
