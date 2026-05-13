package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\u0003*\u00020\u0002H\u0000\u001a\f\u0010\n\u001a\u00020\u0003*\u00020\u0006H\u0000\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "Lbn/r;", "scope", "focusProperties", "Landroidx/compose/ui/focus/FocusModifier;", "properties", "setUpdatedProperties", "clear", "refreshFocusProperties", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/focus/FocusPropertiesModifier;", "ModifierLocalFocusProperties", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalFocusProperties", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class FocusPropertiesKt {

    @NotNull
    private static final ProvidableModifierLocal<FocusPropertiesModifier> ModifierLocalFocusProperties = ModifierLocalKt.modifierLocalOf(new a<FocusPropertiesModifier>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$ModifierLocalFocusProperties$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        @Nullable
        public final FocusPropertiesModifier invoke() {
            return null;
        }
    });

    public static final void clear(@NotNull FocusProperties focusProperties) {
        p.k(focusProperties, "<this>");
        focusProperties.setCanFocus(true);
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        focusProperties.setNext(companion.getDefault());
        focusProperties.setPrevious(companion.getDefault());
        focusProperties.setUp(companion.getDefault());
        focusProperties.setDown(companion.getDefault());
        focusProperties.setLeft(companion.getDefault());
        focusProperties.setRight(companion.getDefault());
        focusProperties.setStart(companion.getDefault());
        focusProperties.setEnd(companion.getDefault());
    }

    @NotNull
    public static final Modifier focusProperties(@NotNull Modifier modifier, @NotNull final l<? super FocusProperties, r> lVar) {
        p.k(modifier, "<this>");
        p.k(lVar, "scope");
        return modifier.then(new FocusPropertiesModifier(lVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$focusProperties$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusProperties");
                inspectorInfo.getProperties().set("scope", lVar);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @NotNull
    public static final ProvidableModifierLocal<FocusPropertiesModifier> getModifierLocalFocusProperties() {
        return ModifierLocalFocusProperties;
    }

    public static final void refreshFocusProperties(@NotNull final FocusModifier focusModifier) {
        OwnerSnapshotObserver snapshotObserver;
        p.k(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if (layoutNodeWrapper == null) {
            return;
        }
        clear(focusModifier.getFocusProperties());
        Owner owner = layoutNodeWrapper.getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.observeReads$ui_release(focusModifier, FocusModifier.INSTANCE.getRefreshFocusProperties(), new a<r>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt.refreshFocusProperties.1
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    FocusPropertiesModifier focusPropertiesModifier = focusModifier.getFocusPropertiesModifier();
                    if (focusPropertiesModifier != null) {
                        focusPropertiesModifier.calculateProperties(focusModifier.getFocusProperties());
                    }
                }
            });
        }
        setUpdatedProperties(focusModifier, focusModifier.getFocusProperties());
    }

    public static final void setUpdatedProperties(@NotNull FocusModifier focusModifier, @NotNull FocusProperties focusProperties) {
        p.k(focusModifier, "<this>");
        p.k(focusProperties, "properties");
        if (focusProperties.getCanFocus()) {
            FocusTransactionsKt.activateNode(focusModifier);
        } else {
            FocusTransactionsKt.deactivateNode(focusModifier);
        }
    }
}
