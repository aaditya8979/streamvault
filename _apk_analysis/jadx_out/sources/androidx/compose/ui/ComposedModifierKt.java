package androidx.compose.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierLocal;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.q;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aT\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\r\u001a^\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u000f\u001ah\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u0011\u001ab\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0012\"\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u0014\u001a\u0012\u0010\u0017\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000\"%\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"%\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "composed", "(Landroidx/compose/ui/Modifier;Lsn/l;Lsn/q;)Landroidx/compose/ui/Modifier;", "", "fullyQualifiedName", "", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Lsn/l;Lsn/q;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lsn/l;Lsn/q;)Landroidx/compose/ui/Modifier;", "key3", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lsn/l;Lsn/q;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;[Ljava/lang/Object;Lsn/l;Lsn/q;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "materialize", "Landroidx/compose/ui/focus/FocusEventModifier;", "WrapFocusEventModifier", "Lsn/q;", "Landroidx/compose/ui/focus/FocusRequesterModifier;", "WrapFocusRequesterModifier", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class ComposedModifierKt {

    @NotNull
    private static final q<FocusEventModifier, Composer, Integer, Modifier> WrapFocusEventModifier = new q<FocusEventModifier, Composer, Integer, FocusEventModifierLocal>() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusEventModifier$1
        @Composable
        @NotNull
        public final FocusEventModifierLocal invoke(@NotNull FocusEventModifier focusEventModifier, @Nullable Composer composer, int i10) {
            p.k(focusEventModifier, "mod");
            composer.startReplaceableGroup(-1790596922);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(focusEventModifier);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusEventModifierLocal(new ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1(focusEventModifier));
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) objRememberedValue;
            EffectsKt.SideEffect(new a<r>() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusEventModifier$1.1
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
                    focusEventModifierLocal.notifyIfNoFocusModifiers();
                }
            }, composer, 0);
            composer.endReplaceableGroup();
            return focusEventModifierLocal;
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ FocusEventModifierLocal invoke(FocusEventModifier focusEventModifier, Composer composer, Integer num) {
            return invoke(focusEventModifier, composer, num.intValue());
        }
    };

    @NotNull
    private static final q<FocusRequesterModifier, Composer, Integer, Modifier> WrapFocusRequesterModifier = new q<FocusRequesterModifier, Composer, Integer, FocusRequesterModifierLocal>() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusRequesterModifier$1
        @Composable
        @NotNull
        public final FocusRequesterModifierLocal invoke(@NotNull FocusRequesterModifier focusRequesterModifier, @Nullable Composer composer, int i10) {
            p.k(focusRequesterModifier, "mod");
            composer.startReplaceableGroup(945678692);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(focusRequesterModifier);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequesterModifierLocal(focusRequesterModifier.getFocusRequester());
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) objRememberedValue;
            composer.endReplaceableGroup();
            return focusRequesterModifierLocal;
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ FocusRequesterModifierLocal invoke(FocusRequesterModifier focusRequesterModifier, Composer composer, Integer num) {
            return invoke(focusRequesterModifier, composer, num.intValue());
        }
    };

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull l<? super InspectorInfo, r> lVar, @NotNull q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        p.k(modifier, "<this>");
        p.k(str, "fullyQualifiedName");
        p.k(lVar, "inspectorInfo");
        p.k(qVar, "factory");
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, lVar, qVar));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @NotNull l<? super InspectorInfo, r> lVar, @NotNull q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        p.k(modifier, "<this>");
        p.k(str, "fullyQualifiedName");
        p.k(lVar, "inspectorInfo");
        p.k(qVar, "factory");
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, lVar, qVar));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull String str, @Nullable Object obj, @NotNull l<? super InspectorInfo, r> lVar, @NotNull q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        p.k(modifier, "<this>");
        p.k(str, "fullyQualifiedName");
        p.k(lVar, "inspectorInfo");
        p.k(qVar, "factory");
        return modifier.then(new KeyedComposedModifier1(str, obj, lVar, qVar));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull String str, @NotNull Object[] objArr, @NotNull l<? super InspectorInfo, r> lVar, @NotNull q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        p.k(modifier, "<this>");
        p.k(str, "fullyQualifiedName");
        p.k(objArr, "keys");
        p.k(lVar, "inspectorInfo");
        p.k(qVar, "factory");
        return modifier.then(new KeyedComposedModifierN(str, objArr, lVar, qVar));
    }

    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull l<? super InspectorInfo, r> lVar, @NotNull q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        p.k(modifier, "<this>");
        p.k(lVar, "inspectorInfo");
        p.k(qVar, "factory");
        return modifier.then(new ComposedModifier(lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, l lVar, q qVar, int i10, Object obj4) {
        if ((i10 & 16) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, lVar, qVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, l lVar, q qVar, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, lVar, qVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, l lVar, q qVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, (l<? super InspectorInfo, r>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, l lVar, q qVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, (l<? super InspectorInfo, r>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, l lVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, lVar, qVar);
    }

    @NotNull
    public static final Modifier materialize(@NotNull final Composer composer, @NotNull Modifier modifier) {
        p.k(composer, "<this>");
        p.k(modifier, "modifier");
        if (modifier.all(new l<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt.materialize.1
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Modifier.Element element) {
                p.k(element, "it");
                return Boolean.valueOf(((element instanceof ComposedModifier) || (element instanceof FocusEventModifier) || (element instanceof FocusRequesterModifier)) ? false : true);
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.INSTANCE, new sn.p<Modifier, Modifier.Element, Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            {
                super(2);
            }

            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Modifier mo2invoke(@NotNull Modifier modifier3, @NotNull Modifier.Element element) {
                Modifier modifierThen;
                p.k(modifier3, "acc");
                p.k(element, "element");
                if (element instanceof ComposedModifier) {
                    modifierThen = ComposedModifierKt.materialize(composer, (Modifier) ((q) y.e(((ComposedModifier) element).getFactory(), 3)).invoke(Modifier.INSTANCE, composer, 0));
                } else {
                    Modifier modifierThen2 = element instanceof FocusEventModifier ? element.then((Modifier) ((q) y.e(ComposedModifierKt.WrapFocusEventModifier, 3)).invoke(element, composer, 0)) : element;
                    modifierThen = element instanceof FocusRequesterModifier ? modifierThen2.then((Modifier) ((q) y.e(ComposedModifierKt.WrapFocusRequesterModifier, 3)).invoke(element, composer, 0)) : modifierThen2;
                }
                return modifier3.then(modifierThen);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }
}
