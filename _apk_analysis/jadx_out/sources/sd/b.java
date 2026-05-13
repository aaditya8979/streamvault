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
import zp.r;

/* JADX INFO: compiled from: EditMineSexPop.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f79617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f79618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f79619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f79620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f79621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f79622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f79623g;

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f79624b;

        public a(Context context) {
            this.f79624b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f79618b.setTextColor(this.f79624b.getResources().getColor(R.color.color_commen));
            b.this.f79619c.setTextColor(this.f79624b.getResources().getColor(R.color.color_text_commen1));
            b.this.f79621e.setTextColor(this.f79624b.getResources().getColor(R.color.color_text_commen1));
            b.this.dismiss();
            f fVar = b.this.f79623g;
            if (fVar != null) {
                fVar.a(1);
            }
        }
    }

    /* JADX INFO: renamed from: sd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class ViewOnClickListenerC0953b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f79626b;

        public ViewOnClickListenerC0953b(Context context) {
            this.f79626b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f79618b.setTextColor(this.f79626b.getResources().getColor(R.color.color_text_commen1));
            b.this.f79619c.setTextColor(this.f79626b.getResources().getColor(R.color.color_commen));
            b.this.f79621e.setTextColor(this.f79626b.getResources().getColor(R.color.color_text_commen1));
            b.this.dismiss();
            f fVar = b.this.f79623g;
            if (fVar != null) {
                fVar.a(2);
            }
        }
    }

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f79628b;

        public c(Context context) {
            this.f79628b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f79618b.setTextColor(this.f79628b.getResources().getColor(R.color.color_text_commen1));
            b.this.f79619c.setTextColor(this.f79628b.getResources().getColor(R.color.color_text_commen1));
            b.this.f79621e.setTextColor(this.f79628b.getResources().getColor(R.color.color_commen));
            b.this.dismiss();
            f fVar = b.this.f79623g;
            if (fVar != null) {
                fVar.a(3);
            }
        }
    }

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public interface f {
        void a(int i10);
    }

    public b(Context context, String str) {
        super(context);
        this.f79622f = str;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_edit_mine_sex, (ViewGroup) null);
        this.f79617a = (LinearLayout) viewInflate.findViewById(R.id.ll_top);
        this.f79618b = (TextView) viewInflate.findViewById(R.id.tv_boy);
        this.f79619c = (TextView) viewInflate.findViewById(R.id.tv_girl);
        this.f79621e = (TextView) viewInflate.findViewById(R.id.tv_secret);
        this.f79620d = (TextView) viewInflate.findViewById(R.id.tv_cancel);
        if (str.equals(r.b().getResources().getString(R.string.str_man))) {
            this.f79618b.setTextColor(context.getResources().getColor(R.color.color_commen));
            this.f79619c.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
            this.f79621e.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
        } else if (str.equals(r.b().getResources().getString(R.string.str_women))) {
            this.f79618b.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
            this.f79619c.setTextColor(context.getResources().getColor(R.color.color_commen));
            this.f79621e.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
        } else if (str.equals(r.b().getResources().getString(R.string.str_secrecy))) {
            this.f79618b.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
            this.f79619c.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
            this.f79621e.setTextColor(context.getResources().getColor(R.color.color_commen));
        }
        this.f79618b.setOnClickListener(new a(context));
        this.f79619c.setOnClickListener(new ViewOnClickListenerC0953b(context));
        this.f79621e.setOnClickListener(new c(context));
        this.f79620d.setOnClickListener(new d());
        this.f79617a.setOnClickListener(new e());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background2));
    }

    public void d(f fVar) {
        this.f79623g = fVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
