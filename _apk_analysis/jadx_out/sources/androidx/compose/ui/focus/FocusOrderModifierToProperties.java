package androidx.compose.ui.focus;

import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderModifierToProperties;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "Lbn/r;", "focusProperties", "invoke", "Landroidx/compose/ui/focus/FocusOrderModifier;", "modifier", "Landroidx/compose/ui/focus/FocusOrderModifier;", "getModifier", "()Landroidx/compose/ui/focus/FocusOrderModifier;", "<init>", "(Landroidx/compose/ui/focus/FocusOrderModifier;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class FocusOrderModifierToProperties implements l<FocusProperties, r> {

    @NotNull
    private final FocusOrderModifier modifier;

    public FocusOrderModifierToProperties(@NotNull FocusOrderModifier focusOrderModifier) {
        p.k(focusOrderModifier, "modifier");
        this.modifier = focusOrderModifier;
    }

    @NotNull
    public final FocusOrderModifier getModifier() {
        return this.modifier;
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(FocusProperties focusProperties) {
        invoke2(focusProperties);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull FocusProperties focusProperties) {
        p.k(focusProperties, "focusProperties");
        this.modifier.populateFocusOrder(new FocusOrder(focusProperties));
    }
}
