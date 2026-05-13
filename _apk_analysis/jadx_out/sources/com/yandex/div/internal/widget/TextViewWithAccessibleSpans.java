package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import cn.w;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.spannable.ImageSpan;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: TextViewWithAccessibleSpans.kt */
/* JADX INFO: loaded from: classes8.dex */
public class TextViewWithAccessibleSpans extends EllipsizedTextView {

    @Nullable
    private String _contentDescription;

    @NotNull
    private final List<ImageSpan> accessibleImageSpans;

    @NotNull
    private final List<ImageSpan> imageSpans;

    @Nullable
    private final SpanHelper spanHelper;

    /* JADX INFO: compiled from: TextViewWithAccessibleSpans.kt */
    public final class SpanHelper extends ExploreByTouchHelper {
        public SpanHelper() {
            super(TextViewWithAccessibleSpans.this);
        }

        private final ImageSpan getSpanForId(int i10) {
            if (i10 != -1 && TextViewWithAccessibleSpans.this.accessibleImageSpans.size() != 0 && i10 < TextViewWithAccessibleSpans.this.accessibleImageSpans.size() && i10 >= 0) {
                return (ImageSpan) TextViewWithAccessibleSpans.this.accessibleImageSpans.get(i10);
            }
            return null;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f10, float f11) {
            RectF rectF = new RectF();
            List list = TextViewWithAccessibleSpans.this.accessibleImageSpans;
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    w.w();
                }
                ((ImageSpan) obj).getBoundsInText(rectF).offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
                if (rectF.contains(f10, f11)) {
                    return i10;
                }
                i10 = i11;
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(@NotNull List<Integer> list) {
            int i10 = 0;
            for (Object obj : TextViewWithAccessibleSpans.this.accessibleImageSpans) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    w.w();
                }
                list.add(Integer.valueOf(i10));
                i10 = i11;
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i10, int i11, @Nullable Bundle bundle) {
            ImageSpan.Accessibility accessibility$div_release;
            ImageSpan.OnAccessibilityClickAction onClickAction;
            ImageSpan spanForId = getSpanForId(i10);
            if (spanForId == null || (accessibility$div_release = spanForId.getAccessibility$div_release()) == null || (onClickAction = accessibility$div_release.getOnClickAction()) == null || i11 != 16) {
                return false;
            }
            onClickAction.perform();
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i10, @NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String accessibilityType;
            ImageSpan spanForId = getSpanForId(i10);
            if (spanForId == null) {
                return;
            }
            ImageSpan.Accessibility accessibility$div_release = spanForId.getAccessibility$div_release();
            if (accessibility$div_release == null || (accessibilityType = accessibility$div_release.getAccessibilityType()) == null) {
                accessibilityType = "";
            }
            accessibilityNodeInfoCompat.setClassName(accessibilityType);
            accessibilityNodeInfoCompat.setPackageName(TextViewWithAccessibleSpans.this.getContext().getPackageName());
            Rect boundsInText = spanForId.getBoundsInText(new Rect());
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            boundsInText.offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
            ImageSpan.Accessibility accessibility$div_release2 = spanForId.getAccessibility$div_release();
            accessibilityNodeInfoCompat.setContentDescription(accessibility$div_release2 != null ? accessibility$div_release2.getContentDescription() : null);
            ImageSpan.Accessibility accessibility$div_release3 = spanForId.getAccessibility$div_release();
            if ((accessibility$div_release3 != null ? accessibility$div_release3.getOnClickAction() : null) == null) {
                accessibilityNodeInfoCompat.setClickable(false);
            } else {
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.addAction(16);
            }
            accessibilityNodeInfoCompat.setBoundsInParent(boundsInText);
        }
    }

    public TextViewWithAccessibleSpans(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.accessibleImageSpans = new ArrayList();
        this.imageSpans = new ArrayList();
        AccessibilityStateProvider.Companion companion = AccessibilityStateProvider.Companion;
        companion.evaluateTouchModeEnabled(context);
        if (!p.f(companion.getTouchExplorationEnabled(), Boolean.TRUE)) {
            this.spanHelper = null;
            return;
        }
        SpanHelper spanHelper = new SpanHelper();
        this.spanHelper = spanHelper;
        ViewCompat.setAccessibilityDelegate(this, spanHelper);
        setAccessibilityLiveRegion(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void evaluateAndSetContentDescription() {
        /*
            r6 = this;
            com.yandex.div.core.util.AccessibilityStateProvider$Companion r0 = com.yandex.div.core.util.AccessibilityStateProvider.Companion
            java.lang.Boolean r0 = r0.getTouchExplorationEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = tn.p.f(r0, r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = r6._contentDescription
            super.setContentDescription(r0)
            return
        L14:
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r6.imageSpans
            r1 = 0
            if (r0 == 0) goto Lc2
            java.lang.String r2 = r6._contentDescription
            if (r2 == 0) goto L1f
            goto Lc2
        L1f:
            int r0 = r0.size()
            if (r0 != 0) goto L27
            goto Lc4
        L27:
            java.lang.CharSequence r0 = r6.getText()
            int r0 = r0.length()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            if (r0 == 0) goto L3a
            goto Lc4
        L3a:
            java.lang.CharSequence r0 = r6.getText()
            boolean r4 = r0 instanceof android.text.SpannableString
            if (r4 == 0) goto L45
            r1 = r0
            android.text.SpannableString r1 = (android.text.SpannableString) r1
        L45:
            if (r1 == 0) goto Lb9
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r6.imageSpans
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = cn.x.x(r0, r5)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L70
            java.lang.Object r5 = r0.next()
            com.yandex.div.core.view2.spannable.ImageSpan r5 = (com.yandex.div.core.view2.spannable.ImageSpan) r5
            int r5 = r1.getSpanStart(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto L58
        L70:
            com.yandex.div.internal.widget.TextViewWithAccessibleSpans$evaluateAndSetContentDescription$lambda$3$$inlined$sortedByDescending$1 r0 = new com.yandex.div.internal.widget.TextViewWithAccessibleSpans$evaluateAndSetContentDescription$lambda$3$$inlined$sortedByDescending$1
            r0.<init>()
            java.util.List r0 = cn.f0.X0(r4, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L82:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto La0
            java.lang.Object r4 = r0.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.CharSequence r5 = r6.getText()
            java.lang.CharSequence r3 = r5.subSequence(r3, r4)
            r1.append(r3)
            int r3 = r4 + 1
            goto L82
        La0:
            java.lang.CharSequence r0 = r6.getText()
            java.lang.CharSequence r2 = r6.getText()
            int r2 = r2.length()
            java.lang.CharSequence r0 = r0.subSequence(r3, r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto Lc4
        Lb9:
            java.lang.CharSequence r0 = r6.getText()
            java.lang.String r1 = r0.toString()
            goto Lc4
        Lc2:
            java.lang.String r1 = r6._contentDescription
        Lc4:
            super.setContentDescription(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.TextViewWithAccessibleSpans.evaluateAndSetContentDescription():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addImageSpan$div_release(@org.jetbrains.annotations.NotNull com.yandex.div.core.view2.spannable.ImageSpan r3) {
        /*
            r2 = this;
            com.yandex.div.core.util.AccessibilityStateProvider$Companion r0 = com.yandex.div.core.util.AccessibilityStateProvider.Companion
            java.lang.Boolean r0 = r0.getTouchExplorationEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = tn.p.f(r0, r1)
            if (r0 == 0) goto L42
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r2.imageSpans
            r0.add(r3)
            com.yandex.div.core.view2.spannable.ImageSpan$Accessibility r0 = r3.getAccessibility$div_release()
            r1 = 0
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.getContentDescription()
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 != 0) goto L2e
            com.yandex.div.core.view2.spannable.ImageSpan$Accessibility r0 = r3.getAccessibility$div_release()
            if (r0 == 0) goto L2c
            com.yandex.div.core.view2.spannable.ImageSpan$OnAccessibilityClickAction r1 = r0.getOnClickAction()
        L2c:
            if (r1 == 0) goto L33
        L2e:
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r2.accessibleImageSpans
            r0.add(r3)
        L33:
            com.yandex.div.internal.widget.TextViewWithAccessibleSpans$SpanHelper r3 = r2.spanHelper
            if (r3 == 0) goto L42
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r2.accessibleImageSpans
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r3.invalidateVirtualView(r0)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.TextViewWithAccessibleSpans.addImageSpan$div_release(com.yandex.div.core.view2.spannable.ImageSpan):void");
    }

    public final void clearImageSpans$div_release() {
        this.accessibleImageSpans.clear();
        this.imageSpans.clear();
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.invalidateRoot();
        }
        evaluateAndSetContentDescription();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent motionEvent) {
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchHoverEvent(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        int i10 = 0;
        for (Object obj : this.accessibleImageSpans) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            SpanHelper spanHelper = this.spanHelper;
            if (spanHelper != null) {
                spanHelper.invalidateVirtualView(i10);
            }
            i10 = i11;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, @Nullable Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence charSequence) {
        this._contentDescription = charSequence != null ? charSequence.toString() : null;
        super.setContentDescription(charSequence);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        evaluateAndSetContentDescription();
    }
}
