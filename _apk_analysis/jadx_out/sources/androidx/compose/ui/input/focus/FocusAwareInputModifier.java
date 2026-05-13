package androidx.compose.ui.input.focus;

import androidx.compose.ui.input.focus.FocusAwareEvent;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: FocusAwareInputModifier.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u0004BI\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u0012\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\bR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R(\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "Landroidx/compose/ui/input/focus/FocusAwareEvent;", "T", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "event", "", "propagatePreEvent", "(Landroidx/compose/ui/input/focus/FocusAwareEvent;)Z", "propagateEvent", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lbn/r;", "onModifierLocalsUpdated", "propagateFocusAwareEvent", "Lkotlin/Function1;", "onEvent", "Lsn/l;", "getOnEvent", "()Lsn/l;", "onPreEvent", "getOnPreEvent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "focusAwareEventParent", "Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "getValue", "()Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "value", "<init>", "(Lsn/l;Lsn/l;Landroidx/compose/ui/modifier/ProvidableModifierLocal;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public class FocusAwareInputModifier<T extends FocusAwareEvent> implements ModifierLocalConsumer, ModifierLocalProvider<FocusAwareInputModifier<T>> {

    @Nullable
    private FocusAwareInputModifier<T> focusAwareEventParent;

    @NotNull
    private final ProvidableModifierLocal<FocusAwareInputModifier<T>> key;

    @Nullable
    private final l<FocusAwareEvent, Boolean> onEvent;

    @Nullable
    private final l<FocusAwareEvent, Boolean> onPreEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusAwareInputModifier(@Nullable l<? super FocusAwareEvent, Boolean> lVar, @Nullable l<? super FocusAwareEvent, Boolean> lVar2, @NotNull ProvidableModifierLocal<FocusAwareInputModifier<T>> providableModifierLocal) {
        p.k(providableModifierLocal, "key");
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
        this.key = providableModifierLocal;
    }

    private final boolean propagateEvent(T event) {
        l<FocusAwareEvent, Boolean> lVar = this.onEvent;
        if (lVar != null && lVar.invoke(event).booleanValue()) {
            return true;
        }
        FocusAwareInputModifier<T> focusAwareInputModifier = this.focusAwareEventParent;
        if (focusAwareInputModifier != null) {
            return focusAwareInputModifier.propagateEvent(event);
        }
        return false;
    }

    private final boolean propagatePreEvent(T event) {
        FocusAwareInputModifier<T> focusAwareInputModifier = this.focusAwareEventParent;
        if (focusAwareInputModifier != null && focusAwareInputModifier.propagatePreEvent(event)) {
            return true;
        }
        l<FocusAwareEvent, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(event).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<FocusAwareInputModifier<T>> getKey() {
        return this.key;
    }

    @Nullable
    public final l<FocusAwareEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    @Nullable
    public final l<FocusAwareEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public FocusAwareInputModifier<T> getValue() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope modifierLocalReadScope) {
        p.k(modifierLocalReadScope, "scope");
        this.focusAwareEventParent = (FocusAwareInputModifier) modifierLocalReadScope.getCurrent(getKey());
    }

    public final boolean propagateFocusAwareEvent(@NotNull T event) {
        p.k(event, "event");
        return propagatePreEvent(event) || propagateEvent(event);
    }
}
