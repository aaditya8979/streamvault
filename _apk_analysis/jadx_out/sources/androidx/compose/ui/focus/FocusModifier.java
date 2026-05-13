package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.focus.FocusAwareInputModifier;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import bn.r;
import com.ironsource.C3996e4;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: FocusModifier.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 t2\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001tB%\u0012\u0006\u0010n\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010q\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\b0o¢\u0006\u0004\br\u0010sJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u00102R\"\u00103\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0017\u0010H\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010M\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010Z\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R(\u0010b\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020`0\u00178\u0006¢\u0006\f\n\u0004\bf\u0010\u0019\u001a\u0004\bg\u0010\u001bR\u0014\u0010h\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010]R\u001c\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010\u001d\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u0014¨\u0006u"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lbn/r;", "onModifierLocalsUpdated", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "", "propagateRotaryEvent", "Landroidx/compose/ui/layout/LayoutCoordinates;", C3996e4.f31528f, "onPlaced", "parent", "Landroidx/compose/ui/focus/FocusModifier;", "getParent", "()Landroidx/compose/ui/focus/FocusModifier;", "setParent", "(Landroidx/compose/ui/focus/FocusModifier;)V", "Landroidx/compose/runtime/collection/MutableVector;", "children", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "focusState", "Landroidx/compose/ui/focus/FocusStateImpl;", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "focusedChild", "getFocusedChild", "setFocusedChild", "Landroidx/compose/ui/focus/FocusEventModifierLocal;", "focusEventListener", "Landroidx/compose/ui/focus/FocusEventModifierLocal;", "getFocusEventListener", "()Landroidx/compose/ui/focus/FocusEventModifierLocal;", "setFocusEventListener", "(Landroidx/compose/ui/focus/FocusEventModifierLocal;)V", "Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "rotaryScrollParent", "Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "getRotaryScrollParent$annotations", "()V", "modifierLocalReadScope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "getModifierLocalReadScope", "()Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "setModifierLocalReadScope", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "setBeyondBoundsLayoutParent", "(Landroidx/compose/ui/layout/BeyondBoundsLayout;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifier;", "focusPropertiesModifier", "Landroidx/compose/ui/focus/FocusPropertiesModifier;", "getFocusPropertiesModifier", "()Landroidx/compose/ui/focus/FocusPropertiesModifier;", "setFocusPropertiesModifier", "(Landroidx/compose/ui/focus/FocusPropertiesModifier;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "getFocusProperties", "()Landroidx/compose/ui/focus/FocusProperties;", "Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequesterModifierLocal;)V", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "layoutNodeWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getLayoutNodeWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setLayoutNodeWrapper", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "focusRequestedOnPlaced", "Z", "getFocusRequestedOnPlaced", "()Z", "setFocusRequestedOnPlaced", "(Z)V", "Landroidx/compose/ui/input/key/KeyInputModifier;", "<set-?>", "keyInputModifier", "Landroidx/compose/ui/input/key/KeyInputModifier;", "getKeyInputModifier", "()Landroidx/compose/ui/input/key/KeyInputModifier;", "keyInputChildren", "getKeyInputChildren", "isValid", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "initialFocus", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/focus/FocusStateImpl;Lsn/l;)V", VastTagName.COMPANION, "ui_release"}, k = 1, mv = {1, 6, 0})
public final class FocusModifier extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider<FocusModifier>, OwnerScope, OnPlacedModifier {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final l<FocusModifier, r> RefreshFocusProperties = new l<FocusModifier, r>() { // from class: androidx.compose.ui.focus.FocusModifier$Companion$RefreshFocusProperties$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(FocusModifier focusModifier) {
            invoke2(focusModifier);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull FocusModifier focusModifier) {
            p.k(focusModifier, "focusModifier");
            FocusPropertiesKt.refreshFocusProperties(focusModifier);
        }
    };

    @Nullable
    private BeyondBoundsLayout beyondBoundsLayoutParent;

    @NotNull
    private final MutableVector<FocusModifier> children;

    @Nullable
    private FocusEventModifierLocal focusEventListener;

    @NotNull
    private final FocusProperties focusProperties;

    @Nullable
    private FocusPropertiesModifier focusPropertiesModifier;
    private boolean focusRequestedOnPlaced;

    @Nullable
    private FocusRequesterModifierLocal focusRequester;

    @NotNull
    private FocusStateImpl focusState;

    @Nullable
    private FocusModifier focusedChild;

    @NotNull
    private final MutableVector<KeyInputModifier> keyInputChildren;

    @Nullable
    private KeyInputModifier keyInputModifier;

    @Nullable
    private LayoutNodeWrapper layoutNodeWrapper;
    public ModifierLocalReadScope modifierLocalReadScope;

    @Nullable
    private FocusModifier parent;

    @Nullable
    private FocusAwareInputModifier<RotaryScrollEvent> rotaryScrollParent;

    /* JADX INFO: compiled from: FocusModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusModifier;", "Lbn/r;", "RefreshFocusProperties", "Lsn/l;", "getRefreshFocusProperties", "()Lsn/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final l<FocusModifier, r> getRefreshFocusProperties() {
            return FocusModifier.RefreshFocusProperties;
        }
    }

    /* JADX INFO: compiled from: FocusModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusModifier(@NotNull FocusStateImpl focusStateImpl, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        p.k(focusStateImpl, "initialFocus");
        p.k(lVar, "inspectorInfo");
        this.children = new MutableVector<>(new FocusModifier[16], 0);
        this.focusState = focusStateImpl;
        this.focusProperties = new FocusPropertiesImpl();
        this.keyInputChildren = new MutableVector<>(new KeyInputModifier[16], 0);
    }

    public /* synthetic */ FocusModifier(FocusStateImpl focusStateImpl, l lVar, int i10, i iVar) {
        this(focusStateImpl, (i10 & 2) != 0 ? InspectableValueKt.getNoInspectorInfo() : lVar);
    }

    private static /* synthetic */ void getRotaryScrollParent$annotations() {
    }

    @Nullable
    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return this.beyondBoundsLayoutParent;
    }

    @NotNull
    public final MutableVector<FocusModifier> getChildren() {
        return this.children;
    }

    @Nullable
    public final FocusEventModifierLocal getFocusEventListener() {
        return this.focusEventListener;
    }

    @NotNull
    public final FocusProperties getFocusProperties() {
        return this.focusProperties;
    }

    @Nullable
    public final FocusPropertiesModifier getFocusPropertiesModifier() {
        return this.focusPropertiesModifier;
    }

    public final boolean getFocusRequestedOnPlaced() {
        return this.focusRequestedOnPlaced;
    }

    @Nullable
    public final FocusRequesterModifierLocal getFocusRequester() {
        return this.focusRequester;
    }

    @NotNull
    public final FocusStateImpl getFocusState() {
        return this.focusState;
    }

    @Nullable
    public final FocusModifier getFocusedChild() {
        return this.focusedChild;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<FocusModifier> getKey() {
        return FocusModifierKt.getModifierLocalParentFocusModifier();
    }

    @NotNull
    public final MutableVector<KeyInputModifier> getKeyInputChildren() {
        return this.keyInputChildren;
    }

    @Nullable
    public final KeyInputModifier getKeyInputModifier() {
        return this.keyInputModifier;
    }

    @Nullable
    public final LayoutNodeWrapper getLayoutNodeWrapper() {
        return this.layoutNodeWrapper;
    }

    @NotNull
    public final ModifierLocalReadScope getModifierLocalReadScope() {
        ModifierLocalReadScope modifierLocalReadScope = this.modifierLocalReadScope;
        if (modifierLocalReadScope != null) {
            return modifierLocalReadScope;
        }
        p.C("modifierLocalReadScope");
        return null;
    }

    @Nullable
    public final FocusModifier getParent() {
        return this.parent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public FocusModifier getValue() {
        return this;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.parent != null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope modifierLocalReadScope) {
        MutableVector<FocusModifier> mutableVector;
        MutableVector<FocusModifier> mutableVector2;
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode layoutNode$ui_release;
        Owner owner$ui_release;
        FocusManager focusManager;
        p.k(modifierLocalReadScope, "scope");
        setModifierLocalReadScope(modifierLocalReadScope);
        FocusModifier focusModifier = (FocusModifier) modifierLocalReadScope.getCurrent(FocusModifierKt.getModifierLocalParentFocusModifier());
        if (!p.f(focusModifier, this.parent)) {
            if (focusModifier == null) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[this.focusState.ordinal()];
                if ((i10 == 1 || i10 == 2) && (layoutNodeWrapper = this.layoutNodeWrapper) != null && (layoutNode$ui_release = layoutNodeWrapper.getLayoutNode()) != null && (owner$ui_release = layoutNode$ui_release.getOwner()) != null && (focusManager = owner$ui_release.getFocusManager()) != null) {
                    focusManager.clearFocus(true);
                }
            }
            FocusModifier focusModifier2 = this.parent;
            if (focusModifier2 != null && (mutableVector2 = focusModifier2.children) != null) {
                mutableVector2.remove(this);
            }
            if (focusModifier != null && (mutableVector = focusModifier.children) != null) {
                mutableVector.add(this);
            }
        }
        this.parent = focusModifier;
        FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) modifierLocalReadScope.getCurrent(FocusEventModifierKt.getModifierLocalFocusEvent());
        if (!p.f(focusEventModifierLocal, this.focusEventListener)) {
            FocusEventModifierLocal focusEventModifierLocal2 = this.focusEventListener;
            if (focusEventModifierLocal2 != null) {
                focusEventModifierLocal2.removeFocusModifier(this);
            }
            if (focusEventModifierLocal != null) {
                focusEventModifierLocal.addFocusModifier(this);
            }
        }
        this.focusEventListener = focusEventModifierLocal;
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) modifierLocalReadScope.getCurrent(FocusRequesterModifierKt.getModifierLocalFocusRequester());
        if (!p.f(focusRequesterModifierLocal, this.focusRequester)) {
            FocusRequesterModifierLocal focusRequesterModifierLocal2 = this.focusRequester;
            if (focusRequesterModifierLocal2 != null) {
                focusRequesterModifierLocal2.removeFocusModifier(this);
            }
            if (focusRequesterModifierLocal != null) {
                focusRequesterModifierLocal.addFocusModifier(this);
            }
        }
        this.focusRequester = focusRequesterModifierLocal;
        this.rotaryScrollParent = (FocusAwareInputModifier) modifierLocalReadScope.getCurrent(RotaryInputModifierKt.getModifierLocalRotaryScrollParent());
        this.beyondBoundsLayoutParent = (BeyondBoundsLayout) modifierLocalReadScope.getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
        this.keyInputModifier = (KeyInputModifier) modifierLocalReadScope.getCurrent(KeyInputModifierKt.getModifierLocalKeyInput());
        this.focusPropertiesModifier = (FocusPropertiesModifier) modifierLocalReadScope.getCurrent(FocusPropertiesKt.getModifierLocalFocusProperties());
        FocusPropertiesKt.refreshFocusProperties(this);
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, C3996e4.f31528f);
        boolean z10 = this.layoutNodeWrapper == null;
        this.layoutNodeWrapper = (LayoutNodeWrapper) layoutCoordinates;
        if (z10) {
            FocusPropertiesKt.refreshFocusProperties(this);
        }
        if (this.focusRequestedOnPlaced) {
            this.focusRequestedOnPlaced = false;
            FocusTransactionsKt.requestFocus(this);
        }
    }

    @ExperimentalComposeUiApi
    public final boolean propagateRotaryEvent(@NotNull RotaryScrollEvent event) {
        p.k(event, "event");
        FocusAwareInputModifier<RotaryScrollEvent> focusAwareInputModifier = this.rotaryScrollParent;
        if (focusAwareInputModifier != null) {
            return focusAwareInputModifier.propagateFocusAwareEvent(event);
        }
        return false;
    }

    public final void setBeyondBoundsLayoutParent(@Nullable BeyondBoundsLayout beyondBoundsLayout) {
        this.beyondBoundsLayoutParent = beyondBoundsLayout;
    }

    public final void setFocusEventListener(@Nullable FocusEventModifierLocal focusEventModifierLocal) {
        this.focusEventListener = focusEventModifierLocal;
    }

    public final void setFocusPropertiesModifier(@Nullable FocusPropertiesModifier focusPropertiesModifier) {
        this.focusPropertiesModifier = focusPropertiesModifier;
    }

    public final void setFocusRequestedOnPlaced(boolean z10) {
        this.focusRequestedOnPlaced = z10;
    }

    public final void setFocusRequester(@Nullable FocusRequesterModifierLocal focusRequesterModifierLocal) {
        this.focusRequester = focusRequesterModifierLocal;
    }

    public final void setFocusState(@NotNull FocusStateImpl focusStateImpl) {
        p.k(focusStateImpl, "value");
        this.focusState = focusStateImpl;
        FocusTransactionsKt.sendOnFocusEvent(this);
    }

    public final void setFocusedChild(@Nullable FocusModifier focusModifier) {
        this.focusedChild = focusModifier;
    }

    public final void setLayoutNodeWrapper(@Nullable LayoutNodeWrapper layoutNodeWrapper) {
        this.layoutNodeWrapper = layoutNodeWrapper;
    }

    public final void setModifierLocalReadScope(@NotNull ModifierLocalReadScope modifierLocalReadScope) {
        p.k(modifierLocalReadScope, "<set-?>");
        this.modifierLocalReadScope = modifierLocalReadScope;
    }

    public final void setParent(@Nullable FocusModifier focusModifier) {
        this.parent = focusModifier;
    }
}
