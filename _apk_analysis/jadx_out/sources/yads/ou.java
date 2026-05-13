package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes12.dex */
public final class ou implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f93328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f93330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f93331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f93332e;

    public ou(Context context, View.OnClickListener onClickListener) {
        this.f93328a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f93329b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f93328a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i10 = action & 255;
        if (i10 == 0) {
            this.f93331d = x10;
            this.f93332e = y10;
            this.f93330c = true;
        } else {
            if (i10 == 1) {
                if (!this.f93330c) {
                    return true;
                }
                this.f93328a.onClick(view);
                return true;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f93330c = false;
                }
            } else if (this.f93330c) {
                int i11 = (int) (x10 - this.f93331d);
                int i12 = (int) (y10 - this.f93332e);
                if ((i12 * i12) + (i11 * i11) > this.f93329b) {
                    this.f93330c = false;
                }
            }
        }
        return false;
    }
}
