package sd;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import zp.o;
import zp.r;

/* JADX INFO: compiled from: ShowOneVideoPop.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f79661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f79662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f79663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f79664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RoundedImageView f79665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f79666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f79667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f79668h;

    /* JADX INFO: compiled from: ShowOneVideoPop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ed.i.a();
            f.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShowOneVideoPop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f79670b;

        public b(RecommandVideosEntity recommandVideosEntity) {
            this.f79670b = recommandVideosEntity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = f.this.f79668h;
            if (cVar != null) {
                cVar.a(this.f79670b.getId());
            }
        }
    }

    /* JADX INFO: compiled from: ShowOneVideoPop.java */
    public interface c {
        void a(int i10);
    }

    public f(Context context, RecommandVideosEntity recommandVideosEntity) {
        super(context);
        this.f79663c = context;
        this.f79664d = recommandVideosEntity;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_once_video, (ViewGroup) null);
        this.f79661a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f79662b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f79665e = (RoundedImageView) viewInflate.findViewById(R.id.iv_image);
        this.f79666f = (TextView) viewInflate.findViewById(R.id.tv_name);
        this.f79667g = (TextView) viewInflate.findViewById(R.id.tv_actor);
        if (recommandVideosEntity != null && !o.b(recommandVideosEntity.getVod_pic()) && recommandVideosEntity.getVod_pic().startsWith("http")) {
            ud.c.c(context, recommandVideosEntity.getVod_pic(), R.drawable.ic_video_default, R.drawable.ic_video_default, this.f79665e, false);
        }
        if (!o.b(recommandVideosEntity.getVod_name())) {
            this.f79666f.setText(recommandVideosEntity.getVod_name());
        }
        if (o.b(recommandVideosEntity.getVod_actor())) {
            this.f79667g.setText(r.b().getResources().getString(R.string.text_actor) + "：" + r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f79667g.setText(r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor());
        }
        this.f79661a.setOnClickListener(new a());
        this.f79662b.setOnClickListener(new b(recommandVideosEntity));
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }

    public void a(c cVar) {
        this.f79668h = cVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
