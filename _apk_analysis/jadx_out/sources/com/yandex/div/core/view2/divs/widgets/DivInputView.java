package com.yandex.div.core.view2.divs.widgets;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import bn.r;
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightEditText;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivInputView.kt */
/* JADX INFO: loaded from: classes7.dex */
public class DivInputView extends SuperLineHeightEditText implements DivHolderView<Div.i> {
    private final /* synthetic */ DivHolderViewMixin<Div.i> $$delegate_0;

    @Nullable
    private String _hint;
    private boolean accessibilityEnabled;

    @Nullable
    private TextView.OnEditorActionListener editorActionListener;
    private boolean enabled;

    @Nullable
    private InputFocusTracker focusTracker;

    @Nullable
    private final Drawable nativeBackground;

    @NotNull
    private final List<l<Editable, r>> onTextChangedActions;

    @Nullable
    private TextWatcher textChangeWatcher;

    public DivInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.nativeBackground = ContextCompat.getDrawable(context, getNativeBackgroundResId());
        this.onTextChangedActions = new ArrayList();
        this.enabled = true;
    }

    public /* synthetic */ DivInputView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divInputStyle : i10);
    }

    @DrawableRes
    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public void addAfterTextChangeAction(@NotNull l<? super Editable, r> lVar) {
        if (this.textChangeWatcher == null) {
            TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$addAfterTextChangeAction$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable editable) {
                    Iterator it = this.this$0.onTextChangedActions.iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).invoke(editable);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
                }
            };
            addTextChangedListener(textWatcher);
            this.textChangeWatcher = textWatcher;
        }
        this.onTextChangedActions.add(lVar);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int iSave;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            iSave = canvas.save();
            try {
                divBorderDrawer.clipCorners(canvas);
                super.draw(canvas);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
            }
        }
        float f10 = scrollX;
        float f11 = scrollY;
        iSave = canvas.save();
        try {
            canvas.translate(f10, f11);
            divBorderDrawer.clipCorners(canvas);
            canvas.translate(-f10, -f11);
            super.draw(canvas);
            canvas.translate(f10, f11);
            divBorderDrawer.drawBorder(canvas);
        } finally {
        }
    }

    public boolean getAccessibilityEnabled$div_release() {
        return this.accessibilityEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Div.i getDiv() {
        return (Div.i) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public InputFocusTracker getFocusTracker$div_release() {
        return this.focusTracker;
    }

    @Nullable
    public Drawable getNativeBackground$div_release() {
        return this.nativeBackground;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i10, int i11) {
        this.$$delegate_0.onBoundsChanged(i10, i11);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return (getInputType() & 131072) == 0 ? inputConnectionOnCreateInputConnection : new InputConnectionWrapper(inputConnectionOnCreateInputConnection) { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView.onCreateInputConnection.1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitText(@Nullable CharSequence charSequence, int i10) {
                if (p.f(charSequence, "\n")) {
                    int imeOptions = this.getImeOptions() & 255;
                    TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, null);
                    }
                }
                return super.commitText(charSequence, i10);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
                if ((keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) && keyEvent.getAction() == 0) {
                    int imeOptions = this.getImeOptions() & 255;
                    TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, keyEvent);
                    }
                }
                return super.sendKeyEvent(keyEvent);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, @Nullable Rect rect) {
        InputFocusTracker focusTracker$div_release = getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            focusTracker$div_release.inputFocusChanged(getTag(), this, z10);
        }
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @Nullable KeyEvent keyEvent) {
        if ((getInputType() & 131072) != 0 && (i10 == 66 || i10 == 160)) {
            int imeOptions = getImeOptions() & 255;
            TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
            if (onEditorActionListener != null) {
                return onEditorActionListener.onEditorAction(this, imeOptions, keyEvent);
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        onBoundsChanged(i10, i11);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void removeAfterTextChangeListener() {
        removeTextChangedListener(this.textChangeWatcher);
        this.onTextChangedActions.clear();
        this.textChangeWatcher = null;
    }

    public void setAccessibilityEnabled$div_release(boolean z10) {
        this.accessibilityEnabled = z10;
        setInputHint(this._hint);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder divBorder, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, divBorder, view);
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setInputHint(this._hint);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Div.i iVar) {
        this.$$delegate_0.setDiv(iVar);
    }

    public void setEnabled$div_release(boolean z10) {
        this.enabled = z10;
        setFocusable(z10);
        setFocusableInTouchMode(z10);
    }

    public void setFocusTracker$div_release(@Nullable InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, android.widget.TextView, com.yandex.div.core.view2.divs.widgets.DivInputView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInputHint(@org.jetbrains.annotations.Nullable java.lang.String r5) {
        /*
            r4 = this;
            r4._hint = r5
            boolean r0 = r4.getAccessibilityEnabled$div_release()
            if (r0 != 0) goto La
            goto L76
        La:
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L17
            int r2 = r5.length()
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = r0
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 == 0) goto L2e
            java.lang.CharSequence r2 = r4.getContentDescription()
            if (r2 == 0) goto L29
            int r2 = r2.length()
            if (r2 != 0) goto L27
            goto L29
        L27:
            r2 = r0
            goto L2a
        L29:
            r2 = r1
        L2a:
            if (r2 == 0) goto L2e
            r5 = 0
            goto L76
        L2e:
            if (r5 == 0) goto L39
            int r2 = r5.length()
            if (r2 != 0) goto L37
            goto L39
        L37:
            r2 = r0
            goto L3a
        L39:
            r2 = r1
        L3a:
            if (r2 == 0) goto L41
            java.lang.CharSequence r5 = r4.getContentDescription()
            goto L76
        L41:
            java.lang.CharSequence r2 = r4.getContentDescription()
            if (r2 == 0) goto L50
            int r2 = r2.length()
            if (r2 != 0) goto L4e
            goto L50
        L4e:
            r2 = r0
            goto L51
        L50:
            r2 = r1
        L51:
            if (r2 == 0) goto L54
            goto L76
        L54:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char[] r1 = new char[r1]
            r3 = 46
            r1[r0] = r3
            java.lang.String r5 = bo.d0.v1(r5, r1)
            r2.append(r5)
            java.lang.String r5 = ". "
            r2.append(r5)
            java.lang.CharSequence r5 = r4.getContentDescription()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
        L76:
            r4.setHint(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivInputView.setInputHint(java.lang.String):void");
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        if (getInputType() == i10) {
            return;
        }
        super.setInputType(i10);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (p.f(getKeyListener(), keyListener)) {
            return;
        }
        super.setKeyListener(keyListener);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    @Override // android.widget.TextView
    public void setOnEditorActionListener(@Nullable TextView.OnEditorActionListener onEditorActionListener) {
        super.setOnEditorActionListener(onEditorActionListener);
        this.editorActionListener = onEditorActionListener;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }
}
