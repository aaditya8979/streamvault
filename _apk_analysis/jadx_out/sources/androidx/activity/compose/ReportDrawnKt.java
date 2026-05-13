package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import bn.r;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ReportDrawnKt {
    @Composable
    public static final void ReportDrawn(@Nullable Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357012904);
        if (i10 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(new sn.a<Boolean>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawn.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            }, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawn.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    ReportDrawnKt.ReportDrawn(composer2, i10 | 1);
                }
            });
        }
    }

    @Composable
    public static final void ReportDrawnAfter(@NotNull final l<? super c<? super r>, ? extends Object> lVar, @Nullable Composer composer, final int i10) {
        int i11;
        FullyDrawnReporter fullyDrawnReporter;
        Composer composerStartRestartGroup = composer.startRestartGroup(945311272);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // sn.p
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return r.f5635a;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            ReportDrawnKt.ReportDrawnAfter(lVar, composer2, i10 | 1);
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-100805929);
            boolean zChanged = composerStartRestartGroup.changed(fullyDrawnReporter) | composerStartRestartGroup.changed(lVar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ReportDrawnKt$ReportDrawnAfter$1$1(fullyDrawnReporter, lVar, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lVar, fullyDrawnReporter, (p) objRememberedValue, composerStartRestartGroup, i11 & 14);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new p<Composer, Integer, r>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnAfter.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    ReportDrawnKt.ReportDrawnAfter(lVar, composer2, i10 | 1);
                }
            });
        }
    }

    @Composable
    public static final void ReportDrawnWhen(@NotNull final sn.a<Boolean> aVar, @Nullable Composer composer, final int i10) {
        int i11;
        final FullyDrawnReporter fullyDrawnReporter;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // sn.p
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return r.f5635a;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            ReportDrawnKt.ReportDrawnWhen(aVar, composer2, i10 | 1);
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-537074000);
            boolean zChanged = composerStartRestartGroup.changed(fullyDrawnReporter) | composerStartRestartGroup.changed(aVar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        if (fullyDrawnReporter.isFullyDrawnReported()) {
                            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                }
                            };
                        }
                        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter, aVar);
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                reportDrawnComposition.removeReporter();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(fullyDrawnReporter, aVar, (l) objRememberedValue, composerStartRestartGroup, (i11 << 3) & 112);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new p<Composer, Integer, r>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnWhen.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    ReportDrawnKt.ReportDrawnWhen(aVar, composer2, i10 | 1);
                }
            });
        }
    }
}
