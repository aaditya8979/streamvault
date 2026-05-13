package sd;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.dramarush.shortin.R;

/* JADX INFO: compiled from: ShowAdLoadingPop.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f79647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f79648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f79649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimationDrawable f79650d;

    public d(Context context) {
        super(context);
        this.f79649c = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_ad_loading, (ViewGroup) null);
        this.f79647a = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.loadingImageView);
        this.f79648b = imageView;
        this.f79650d = (AnimationDrawable) imageView.getBackground();
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(false);
        setOutsideTouchable(false);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
