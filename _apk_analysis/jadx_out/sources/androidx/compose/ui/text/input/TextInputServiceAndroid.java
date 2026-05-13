package androidx.compose.ui.text.input;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.TextRange;
import bn.g;
import bn.r;
import com.mbridge.msdk.MBridgeConstans;
import fo.d;
import hn.c;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001FB\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\bC\u0010DB\u0011\b\u0010\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\bC\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0004JI\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u0010H\u0016ø\u0001\u0000J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0013\u0010\u001a\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0017R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R(\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R%\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010,R$\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Lbn/r;", "restartInputImmediately", "", VastAttributes.VISIBLE, "setKeyboardVisibleImmediately", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "isEditorFocused", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "textInputCommandEventLoop", "(Lhn/c;)Ljava/lang/Object;", "oldValue", "newValue", "updateState", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "editorHasFocus", "Z", "Lsn/l;", "<set-?>", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/input/ImeOptions;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "ic", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lbn/g;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "Lfo/d;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "textInputCommandChannel", "Lfo/d;", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;)V", "(Landroid/view/View;)V", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* JADX INFO: renamed from: baseInputConnection$delegate, reason: from kotlin metadata */
    @NotNull
    private final g baseInputConnection;
    private boolean editorHasFocus;

    @Nullable
    private Rect focusedRect;

    @Nullable
    private RecordingInputConnection ic;

    @NotNull
    private ImeOptions imeOptions;

    @NotNull
    private final InputMethodManager inputMethodManager;

    @NotNull
    private l<? super List<? extends EditCommand>, r> onEditCommand;

    @NotNull
    private l<? super ImeAction, r> onImeActionPerformed;

    @NotNull
    private TextFieldValue state;

    @NotNull
    private final d<TextInputCommand> textInputCommandChannel;

    @NotNull
    private final View view;

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            iArr[TextInputCommand.StartInput.ordinal()] = 1;
            iArr[TextInputCommand.StopInput.ordinal()] = 2;
            iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @jn.d(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {189}, m = "textInputCommandEventLoop")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C13601 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C13601(c<? super C13601> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextInputServiceAndroid.this.textInputCommandEventLoop(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputServiceAndroid(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        Context context = view.getContext();
        p.j(context, "view.context");
        this(view, new InputMethodManagerImpl(context));
    }

    public TextInputServiceAndroid(@NotNull View view, @NotNull InputMethodManager inputMethodManager) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(inputMethodManager, "inputMethodManager");
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.onEditCommand = new l<List<? extends EditCommand>, r>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<? extends EditCommand> list) {
                p.k(list, "it");
            }
        };
        this.onImeActionPerformed = new l<ImeAction, r>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(ImeAction imeAction) {
                m3652invokeKlQnJC8(imeAction.getValue());
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3652invokeKlQnJC8(int i10) {
            }
        };
        this.state = new TextFieldValue("", TextRange.INSTANCE.m3479getZerod9O1mEE(), (TextRange) null, 4, (i) null);
        this.imeOptions = ImeOptions.INSTANCE.getDefault();
        this.baseInputConnection = b.a(LazyThreadSafetyMode.NONE, new sn.a<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.getView(), false);
            }
        });
        this.textInputCommandChannel = fo.g.b(Integer.MAX_VALUE, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput(this.view);
    }

    private final void setKeyboardVisibleImmediately(boolean z10) {
        if (z10) {
            this.inputMethodManager.showSoftInput(this.view);
        } else {
            this.inputMethodManager.hideSoftInputFromWindow(this.view.getWindowToken());
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void textInputCommandEventLoop$applyToState(TextInputCommand textInputCommand, Ref$ObjectRef<Boolean> ref$ObjectRef, Ref$ObjectRef<Boolean> ref$ObjectRef2) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i10 == 1) {
            ?? r32 = Boolean.TRUE;
            ref$ObjectRef.element = r32;
            ref$ObjectRef2.element = r32;
        } else if (i10 == 2) {
            ?? r33 = Boolean.FALSE;
            ref$ObjectRef.element = r33;
            ref$ObjectRef2.element = r33;
        } else if ((i10 == 3 || i10 == 4) && !p.f(ref$ObjectRef.element, Boolean.FALSE)) {
            ref$ObjectRef2.element = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        p.k(outAttrs, "outAttrs");
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(outAttrs, this.imeOptions, this.state);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.createInputConnection.1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(@NotNull List<? extends EditCommand> list) {
                p.k(list, "editCommands");
                TextInputServiceAndroid.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
            public void mo3618onImeActionKlQnJC8(int imeAction) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.m3597boximpl(imeAction));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(@NotNull KeyEvent keyEvent) {
                p.k(keyEvent, "event");
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ic = recordingInputConnection;
        return recordingInputConnection;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$ui_release, reason: from getter */
    public final TextFieldValue getState() {
        return this.state;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        this.textInputCommandChannel.i(TextInputCommand.HideKeyboard);
    }

    /* JADX INFO: renamed from: isEditorFocused, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(@NotNull androidx.compose.ui.geometry.Rect rect) {
        p.k(rect, "rect");
        Rect rect2 = new Rect(vn.c.d(rect.getLeft()), vn.c.d(rect.getTop()), vn.c.d(rect.getRight()), vn.c.d(rect.getBottom()));
        this.focusedRect = rect2;
        if (this.ic == null) {
            this.view.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        this.textInputCommandChannel.i(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@NotNull TextFieldValue textFieldValue, @NotNull ImeOptions imeOptions, @NotNull l<? super List<? extends EditCommand>, r> lVar, @NotNull l<? super ImeAction, r> lVar2) {
        p.k(textFieldValue, "value");
        p.k(imeOptions, "imeOptions");
        p.k(lVar, "onEditCommand");
        p.k(lVar2, "onImeActionPerformed");
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = lVar;
        this.onImeActionPerformed = lVar2;
        this.textInputCommandChannel.i(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new l<List<? extends EditCommand>, r>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<? extends EditCommand> list) {
                p.k(list, "it");
            }
        };
        this.onImeActionPerformed = new l<ImeAction, r>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(ImeAction imeAction) {
                m3653invokeKlQnJC8(imeAction.getValue());
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3653invokeKlQnJC8(int i10) {
            }
        };
        this.focusedRect = null;
        this.textInputCommandChannel.i(TextInputCommand.StopInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object textInputCommandEventLoop(@org.jetbrains.annotations.NotNull hn.c<? super bn.r> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.text.input.TextInputServiceAndroid.C13601
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = (androidx.compose.ui.text.input.TextInputServiceAndroid.C13601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = new androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.L$1
            fo.f r2 = (fo.f) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.ui.text.input.TextInputServiceAndroid r4 = (androidx.compose.ui.text.input.TextInputServiceAndroid) r4
            kotlin.c.b(r9)
            goto L51
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            kotlin.c.b(r9)
            fo.d<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r8.textInputCommandChannel
            fo.f r9 = r9.iterator()
            r4 = r8
            r2 = r9
        L44:
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r9 = r2.a(r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lbd
            java.lang.Object r9 = r2.next()
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r9 = (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand) r9
            android.view.View r5 = r4.view
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L74
        L67:
            fo.d<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r4.textInputCommandChannel
            java.lang.Object r9 = r9.r()
            boolean r9 = kotlinx.coroutines.channels.a.i(r9)
            if (r9 != 0) goto L67
            goto L44
        L74:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
        L7e:
            if (r9 == 0) goto L90
            textInputCommandEventLoop$applyToState(r9, r5, r6)
            fo.d<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r4.textInputCommandChannel
            java.lang.Object r9 = r9.r()
            java.lang.Object r9 = kotlinx.coroutines.channels.a.f(r9)
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r9 = (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand) r9
            goto L7e
        L90:
            T r9 = r5.element
            java.lang.Boolean r7 = jn.a.a(r3)
            boolean r9 = tn.p.f(r9, r7)
            if (r9 == 0) goto L9f
            r4.restartInputImmediately()
        L9f:
            T r9 = r6.element
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto Lac
            boolean r9 = r9.booleanValue()
            r4.setKeyboardVisibleImmediately(r9)
        Lac:
            T r9 = r5.element
            r5 = 0
            java.lang.Boolean r5 = jn.a.a(r5)
            boolean r9 = tn.p.f(r9, r5)
            if (r9 == 0) goto L44
            r4.restartInputImmediately()
            goto L44
        Lbd:
            bn.r r9 = bn.r.f5635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.textInputCommandEventLoop(hn.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@Nullable TextFieldValue textFieldValue, @NotNull TextFieldValue textFieldValue2) {
        p.k(textFieldValue2, "newValue");
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (TextRange.m3467equalsimpl0(this.state.getSelection(), textFieldValue2.getSelection()) && p.f(this.state.getComposition(), textFieldValue2.getComposition())) ? false : true;
        this.state = textFieldValue2;
        RecordingInputConnection recordingInputConnection = this.ic;
        if (recordingInputConnection != null) {
            recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
        }
        if (p.f(textFieldValue, textFieldValue2)) {
            if (z12) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                View view = this.view;
                int iM3472getMinimpl = TextRange.m3472getMinimpl(textFieldValue2.getSelection());
                int iM3471getMaximpl = TextRange.m3471getMaximpl(textFieldValue2.getSelection());
                TextRange composition = this.state.getComposition();
                int iM3472getMinimpl2 = composition != null ? TextRange.m3472getMinimpl(composition.getPackedValue()) : -1;
                TextRange composition2 = this.state.getComposition();
                inputMethodManager.updateSelection(view, iM3472getMinimpl, iM3471getMaximpl, iM3472getMinimpl2, composition2 != null ? TextRange.m3471getMaximpl(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null) {
            if (p.f(textFieldValue.getText(), textFieldValue2.getText()) && (!TextRange.m3467equalsimpl0(textFieldValue.getSelection(), textFieldValue2.getSelection()) || p.f(textFieldValue.getComposition(), textFieldValue2.getComposition()))) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11) {
            restartInputImmediately();
            return;
        }
        RecordingInputConnection recordingInputConnection2 = this.ic;
        if (recordingInputConnection2 != null) {
            recordingInputConnection2.updateInputState(this.state, this.inputMethodManager, this.view);
        }
    }
}
