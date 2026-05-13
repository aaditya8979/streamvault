package sd;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import zp.o;
import zp.r;

/* JADX INFO: compiled from: VideoDetailPop.java */
/* JADX INFO: loaded from: classes3.dex */
public class j extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f79684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f79685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f79686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f79687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f79688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f79689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f79690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Activity f79691h;

    /* JADX INFO: compiled from: VideoDetailPop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.dismiss();
        }
    }

    public j(Activity activity, Context context, RecommandVideosEntity recommandVideosEntity) {
        super(context);
        this.f79690g = context;
        this.f79691h = activity;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail, (ViewGroup) null);
        this.f79684a = (TextView) viewInflate.findViewById(R.id.tv_name);
        this.f79685b = (TextView) viewInflate.findViewById(R.id.tv_director);
        this.f79686c = (TextView) viewInflate.findViewById(R.id.tv_actor);
        this.f79687d = (TextView) viewInflate.findViewById(R.id.tv_time);
        this.f79688e = (TextView) viewInflate.findViewById(R.id.tv_content);
        this.f79689f = (TextView) viewInflate.findViewById(R.id.tv_intros);
        if (recommandVideosEntity != null && !o.b(recommandVideosEntity.getVod_name())) {
            this.f79684a.setText(recommandVideosEntity.getVod_name());
            if (o.b(recommandVideosEntity.getVod_director())) {
                this.f79685b.setText(r.b().getResources().getString(R.string.text_director) + "：" + r.b().getResources().getString(R.string.text_unknow));
            } else {
                this.f79685b.setText(r.b().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director());
            }
            if (o.b(recommandVideosEntity.getVod_actor())) {
                this.f79686c.setText(r.b().getResources().getString(R.string.text_actor) + "：" + r.b().getResources().getString(R.string.text_unknow));
            } else {
                this.f79686c.setText(r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor());
            }
            if (o.b(recommandVideosEntity.getVod_year())) {
                this.f79687d.setText(r.b().getResources().getString(R.string.text_year) + "：" + r.b().getResources().getString(R.string.text_unknow));
            } else {
                this.f79687d.setText(r.b().getResources().getString(R.string.text_year) + "：" + recommandVideosEntity.getVod_year());
            }
            if (o.b(recommandVideosEntity.getVod_blurb())) {
                this.f79688e.setText(recommandVideosEntity.getVod_blurb());
                this.f79689f.setVisibility(8);
            } else {
                this.f79688e.setText(recommandVideosEntity.getVod_blurb());
                this.f79689f.setVisibility(0);
            }
        }
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new a());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + ed.e.n(this.f79690g));
        super.showAsDropDown(view);
    }
}
