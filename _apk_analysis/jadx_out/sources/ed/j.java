package ed;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: FlyAnimUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RelativeLayout f61068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PathMeasure f61069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f61070c = new float[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f61071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f61072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f61073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f61074g;

    /* JADX INFO: compiled from: FlyAnimUtil.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f61075b;

        public a(ImageView imageView) {
            this.f61075b = imageView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.this.f61069b.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), j.this.f61070c, null);
            this.f61075b.setTranslationX(j.this.f61070c[0]);
            this.f61075b.setTranslationY(j.this.f61070c[1]);
        }
    }

    /* JADX INFO: compiled from: FlyAnimUtil.java */
    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f61077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f61078c;

        public b(ImageView imageView, c cVar) {
            this.f61077b = imageView;
            this.f61078c = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f61068a.removeView(this.f61077b);
            c cVar = this.f61078c;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: FlyAnimUtil.java */
    public interface c {
        void a();
    }

    public j(Context context, RelativeLayout relativeLayout) {
        this.f61074g = context;
        this.f61068a = relativeLayout;
    }

    public void d(c cVar) {
        if (this.f61071d == null || this.f61072e == null || this.f61074g == null) {
            throw new NullPointerException("=====FlyAnim空指针异常============");
        }
        ImageView imageView = new ImageView(this.f61074g);
        imageView.setImageResource(this.f61073f);
        this.f61068a.addView(imageView, new RelativeLayout.LayoutParams(30, 30));
        int[] iArr = new int[2];
        this.f61068a.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f61071d.getLocationInWindow(iArr2);
        int[] iArr3 = new int[2];
        this.f61072e.getLocationInWindow(iArr3);
        float width = (iArr2[0] - iArr[0]) + (this.f61071d.getWidth() / 2);
        float height = (iArr2[1] - iArr[1]) + (this.f61071d.getHeight() / 2);
        float width2 = (iArr3[0] - iArr[0]) + (this.f61072e.getWidth() / 5);
        float f10 = iArr3[1] - iArr[1];
        Path path = new Path();
        path.moveTo(width, height);
        path.quadTo((width + width2) / 2.0f, height, width2, f10);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f61069b = pathMeasure;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new a(imageView));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat.addListener(new b(imageView, cVar));
    }

    public j e(int i10) {
        this.f61073f = i10;
        return this;
    }

    public j f(View view) {
        this.f61071d = view;
        return this;
    }

    public j g(View view) {
        this.f61072e = view;
        return this;
    }
}
