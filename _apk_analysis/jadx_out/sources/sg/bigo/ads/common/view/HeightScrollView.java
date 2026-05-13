package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class HeightScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f82556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f82557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f82558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f82559d;

    public interface a {
        void a(int i10);
    }

    public HeightScrollView(Context context) {
        super(context);
        this.f82557b = true;
        this.f82559d = 0;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82557b = true;
        this.f82559d = 0;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f82557b = true;
        this.f82559d = 0;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        View view = this.f82558c;
        if (view != null) {
            this.f82559d = view.getHeight() - i11;
        }
        a aVar = this.f82556a;
        if (aVar != null) {
            aVar.a(i11);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (this.f82557b) {
            if (!(this.f82558c != null && y10 < this.f82559d)) {
                return super.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    public void setBlankView(View view) {
        this.f82558c = view;
    }

    public void setOnScrollListener(a aVar) {
        this.f82556a = aVar;
    }

    public void setScrollEnable(boolean z10) {
        this.f82557b = z10;
    }
}
