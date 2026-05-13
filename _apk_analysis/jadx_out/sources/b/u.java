package b;

import android.view.MotionEvent;
import android.view.View;
import com.yk.e.activity.GameActivity;
import com.yk.e.util.StringUtil;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f5339b;

    public u(GameActivity gameActivity) {
        this.f5339b = gameActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5339b.f3314L11I = motionEvent.getX();
            this.f5339b.f3318il = motionEvent.getY();
            GameActivity gameActivity = this.f5339b;
            gameActivity.ILL = gameActivity.f3312IiL.getX();
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            float x10 = motionEvent.getX() - this.f5339b.f3314L11I;
            float y10 = motionEvent.getY();
            GameActivity gameActivity2 = this.f5339b;
            float f10 = y10 - gameActivity2.f3318il;
            float x11 = gameActivity2.f3312IiL.getX();
            float y11 = this.f5339b.f3312IiL.getY();
            int width = this.f5339b.f3312IiL.getWidth();
            float f11 = x11 + x10;
            float height = this.f5339b.f3312IiL.getHeight() + f11;
            GameActivity gameActivity3 = this.f5339b;
            if (height > gameActivity3.f3313Ll1) {
                gameActivity3.f3312IiL.setX(r7 - r5);
            } else if (f11 <= 0.0f) {
                gameActivity3.f3312IiL.setX(0.0f);
            } else {
                gameActivity3.f3312IiL.setX(f11);
            }
            float f12 = y11 + f10;
            float f13 = width + f12;
            GameActivity gameActivity4 = this.f5339b;
            if (f13 > gameActivity4.f3316lIiI) {
                gameActivity4.f3312IiL.setY(r1 - width);
            } else if (f12 <= 0.0f) {
                gameActivity4.f3312IiL.setY(0.0f);
            } else {
                gameActivity4.f3312IiL.setY(f12);
            }
            return true;
        }
        float x12 = this.f5339b.f3312IiL.getX();
        float x13 = this.f5339b.f3312IiL.getX();
        float x14 = r3.f3313Ll1 - this.f5339b.f3312IiL.getX();
        float y12 = this.f5339b.f3312IiL.getY();
        float y13 = r5.f3316lIiI - this.f5339b.f3312IiL.getY();
        if (x13 > x14) {
            x13 = x14;
        }
        if (y12 > y13) {
            y12 = y13;
        }
        if (x13 < y12) {
            if (x13 == x14) {
                this.f5339b.f3312IiL.setX(r11.f3313Ll1 - r2.getWidth());
            } else {
                this.f5339b.f3312IiL.setX(0.0f);
            }
        } else if (y12 == y13) {
            this.f5339b.f3312IiL.setY(r11.f3316lIiI - r2.getHeight());
        } else {
            this.f5339b.f3312IiL.setY(0.0f);
        }
        int iDip2px = StringUtil.dip2px(this.f5339b, 1.0f);
        GameActivity gameActivity5 = this.f5339b;
        float f14 = gameActivity5.ILL;
        float f15 = iDip2px;
        if (f14 <= x12 - f15 || f14 >= x12 + f15) {
            return true;
        }
        GameActivity.IL1Iii(gameActivity5, false);
        return false;
    }
}
