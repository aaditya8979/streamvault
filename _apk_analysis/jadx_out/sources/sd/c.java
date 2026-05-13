package sd;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.safedk.android.utils.Logger;
import ed.l0;

/* JADX INFO: compiled from: ShowAdDownloadPop.java */
/* JADX INFO: loaded from: classes7.dex */
public class c extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f79632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f79633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f79634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f79635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f79636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f79637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f79638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f79639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AnimationDrawable f79640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f79641j;

    /* JADX INFO: compiled from: ShowAdDownloadPop.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fd.h f79642b;

        public a(fd.h hVar) {
            this.f79642b = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            fd.h hVar = this.f79642b;
            if (hVar != null) {
                hVar.a();
            }
            c.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShowAdDownloadPop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f79644b;

        public b(Context context) {
            this.f79644b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = c.this;
            d dVar = cVar.f79641j;
            if (dVar != null) {
                dVar.a(true, cVar.f79636e, c.this.f79637f, this.f79644b);
            }
        }
    }

    /* JADX INFO: renamed from: sd.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ShowAdDownloadPop.java */
    public class ViewOnClickListenerC0954c implements View.OnClickListener {
        public ViewOnClickListenerC0954c() {
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            context.startActivity(intent);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(c.this.f79639h, new Intent(c.this.f79639h, (Class<?>) ExtensionShareActivity.class));
        }
    }

    /* JADX INFO: compiled from: ShowAdDownloadPop.java */
    public interface d {
        void a(boolean z10, RelativeLayout relativeLayout, LinearLayout linearLayout, Context context);
    }

    public c(Context context, fd.h hVar) {
        super(context);
        this.f79639h = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_ad_download, (ViewGroup) null);
        this.f79632a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f79633b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f79634c = (TextView) viewInflate.findViewById(R.id.tv_extension_share);
        this.f79635d = (TextView) viewInflate.findViewById(R.id.tv_tips);
        this.f79636e = (RelativeLayout) viewInflate.findViewById(R.id.rl_show);
        this.f79637f = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.loadingImageView);
        this.f79638g = imageView;
        this.f79640i = (AnimationDrawable) imageView.getBackground();
        this.f79635d.setText(context.getResources().getString(R.string.str_look_ad_tips2, l0.e() + ""));
        this.f79632a.setOnClickListener(new a(hVar));
        this.f79633b.setOnClickListener(new b(context));
        this.f79634c.setOnClickListener(new ViewOnClickListenerC0954c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }

    public void d(d dVar) {
        this.f79641j = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
