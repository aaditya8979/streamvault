package sg.bigo.ads.core.mraid.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Drawable f84066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f84067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private b f84068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private EnumC1050a f84069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f84070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f84071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f84072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f84073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f84074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f84075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f84076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f84077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f84078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private c f84079n;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a.a$a, reason: collision with other inner class name */
    public enum EnumC1050a {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f84088h;

        EnumC1050a(int i10) {
            this.f84088h = i10;
        }
    }

    public interface b {
        void a();
    }

    public final class c implements Runnable {
        private c() {
        }

        public /* synthetic */ c(a aVar, byte b10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.setClosePressed(false);
        }
    }

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private a(@NonNull Context context, byte b10) {
        super(context, null, 0);
        this.f84074i = new Rect();
        this.f84075j = new Rect();
        this.f84076k = new Rect();
        this.f84077l = new Rect();
        Drawable drawableA = sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close);
        this.f84066a = drawableA;
        this.f84069d = EnumC1050a.TOP_RIGHT;
        drawableA.setState(FrameLayout.EMPTY_STATE_SET);
        drawableA.setCallback(this);
        this.f84067b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f84070e = e.a(context, 50);
        this.f84071f = e.a(context, 30);
        this.f84072g = e.a(context, 8);
        setWillNotDraw(false);
        this.f84078m = true;
    }

    private static void a(EnumC1050a enumC1050a, int i10, Rect rect, Rect rect2) {
        Gravity.apply(enumC1050a.f84088h, i10, i10, rect, rect2);
    }

    @VisibleForTesting
    private boolean a() {
        return this.f84066a.getState() == FrameLayout.SELECTED_STATE_SET;
    }

    @VisibleForTesting
    private boolean a(int i10, int i11, int i12) {
        Rect rect = this.f84075j;
        return i10 >= rect.left - i12 && i11 >= rect.top - i12 && i10 < rect.right + i12 && i11 < rect.bottom + i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z10) {
        if (z10 == a()) {
            return;
        }
        this.f84066a.setState(z10 ? FrameLayout.SELECTED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        invalidate(this.f84075j);
    }

    public final void a(EnumC1050a enumC1050a, Rect rect, Rect rect2) {
        a(enumC1050a, this.f84070e, rect, rect2);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f84073h) {
            this.f84073h = false;
            this.f84074i.set(0, 0, getWidth(), getHeight());
            a(this.f84069d, this.f84074i, this.f84075j);
            this.f84077l.set(this.f84075j);
            Rect rect = this.f84077l;
            int i10 = this.f84072g;
            rect.inset(i10, i10);
            a(this.f84069d, this.f84071f, this.f84077l, this.f84076k);
            this.f84066a.setBounds(this.f84076k);
        }
        if (this.f84066a.isVisible()) {
            this.f84066a.draw(canvas);
        }
    }

    @VisibleForTesting
    public final Rect getCloseBounds() {
        return this.f84075j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f84073h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        byte b10 = 0;
        if (a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f84067b)) {
            if (this.f84078m || this.f84066a.isVisible()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setClosePressed(true);
                } else if (action != 1) {
                    if (action == 3) {
                        setClosePressed(false);
                    }
                } else if (a()) {
                    if (this.f84079n == null) {
                        this.f84079n = new c(this, b10);
                    }
                    postDelayed(this.f84079n, ViewConfiguration.getPressedStateDuration());
                    playSoundEffect(0);
                    b bVar = this.f84068c;
                    if (bVar != null) {
                        bVar.a();
                    }
                }
                return true;
            }
        }
        setClosePressed(false);
        super.onTouchEvent(motionEvent);
        return false;
    }

    public final void setCloseAlwaysInteractable(boolean z10) {
        this.f84078m = z10;
    }

    @VisibleForTesting
    public final void setCloseBoundChanged(boolean z10) {
        this.f84073h = z10;
    }

    @VisibleForTesting
    public final void setCloseBounds(Rect rect) {
        this.f84075j.set(rect);
    }

    public final void setClosePosition(@NonNull EnumC1050a enumC1050a) {
        this.f84069d = enumC1050a;
        this.f84073h = true;
        invalidate();
    }

    public final void setCloseVisible(boolean z10) {
        if (this.f84066a.setVisible(z10, false)) {
            invalidate(this.f84075j);
        }
    }

    public final void setOnCloseListener(@Nullable b bVar) {
        this.f84068c = bVar;
    }
}
