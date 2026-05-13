package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* JADX INFO: loaded from: classes11.dex */
public class CustomTouchImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdCountDownButton.a f80221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f80222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f80223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f80224d;

    public CustomTouchImageView(Context context) {
        super(context);
        this.f80222b = new Rect();
        this.f80223c = 1.0f;
        this.f80224d = true;
    }

    public CustomTouchImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80222b = new Rect();
        this.f80223c = 1.0f;
        this.f80224d = true;
    }

    public CustomTouchImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f80222b = new Rect();
        this.f80223c = 1.0f;
        this.f80224d = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f80224d && motionEvent.getAction() == 0) {
            if (this.f80223c == 1.0f) {
                AdCountDownButton.a aVar = this.f80221a;
                if (aVar != null) {
                    aVar.a();
                }
                return true;
            }
            float x10 = (int) motionEvent.getX();
            float y10 = (int) motionEvent.getY();
            float f10 = this.f80223c;
            float width = getWidth();
            float f11 = width * f10;
            float height = getHeight();
            float f12 = f10 * height;
            float f13 = (width - f11) / 2.0f;
            float f14 = (height - f12) / 2.0f;
            if (x10 >= f13 && x10 <= f11 + f13 && y10 >= f14 && y10 <= f12 + f14) {
                AdCountDownButton.a aVar2 = this.f80221a;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return true;
            }
            getGlobalVisibleRect(this.f80222b);
            AdCountDownButton.a aVar3 = this.f80221a;
            if (aVar3 != null) {
                aVar3.a(this.f80222b);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        this.f80224d = z10;
    }

    public void setCloseListener(AdCountDownButton.a aVar) {
        this.f80221a = aVar;
    }

    public void setRegionScale(float f10) {
        this.f80223c = f10;
    }
}
