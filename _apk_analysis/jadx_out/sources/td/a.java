package td;

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
import fd.h;

/* JADX INFO: compiled from: ShowAdClingPop.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f85223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f85224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f85225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f85226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f85227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f85228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f85229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f85230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AnimationDrawable f85231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f85232j;

    /* JADX INFO: renamed from: td.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ShowAdClingPop.java */
    public class ViewOnClickListenerC1063a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f85233b;

        public ViewOnClickListenerC1063a(h hVar) {
            this.f85233b = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = this.f85233b;
            if (hVar != null) {
                hVar.a();
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShowAdClingPop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f85235b;

        public b(Context context) {
            this.f85235b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            d dVar = aVar.f85232j;
            if (dVar != null) {
                dVar.a(true, aVar.f85227e, a.this.f85228f, this.f85235b);
            }
        }
    }

    /* JADX INFO: compiled from: ShowAdClingPop.java */
    public class c implements View.OnClickListener {
        public c() {
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
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(a.this.f85230h, new Intent(a.this.f85230h, (Class<?>) ExtensionShareActivity.class));
        }
    }

    /* JADX INFO: compiled from: ShowAdClingPop.java */
    public interface d {
        void a(boolean z10, RelativeLayout relativeLayout, LinearLayout linearLayout, Context context);
    }

    public a(Context context, h hVar) {
        super(context);
        this.f85230h = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_ad_cling, (ViewGroup) null);
        this.f85223a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f85224b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f85225c = (TextView) viewInflate.findViewById(R.id.tv_extension_share);
        this.f85226d = (TextView) viewInflate.findViewById(R.id.tv_tips);
        this.f85227e = (RelativeLayout) viewInflate.findViewById(R.id.rl_show);
        this.f85228f = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.loadingImageView);
        this.f85229g = imageView;
        this.f85231i = (AnimationDrawable) imageView.getBackground();
        this.f85226d.setText(context.getResources().getString(R.string.str_cling_ad));
        this.f85223a.setOnClickListener(new ViewOnClickListenerC1063a(hVar));
        this.f85224b.setOnClickListener(new b(context));
        this.f85225c.setOnClickListener(new c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }

    public void d(d dVar) {
        this.f85232j = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
