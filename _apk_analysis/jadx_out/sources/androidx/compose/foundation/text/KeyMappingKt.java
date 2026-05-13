package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: KeyMapping.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000ø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class KeyMappingKt {

    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m2857isCtrlPressedZmokQxo(((KeyEvent) obj).m2842unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo687mapZmokQxo(@NotNull android.view.KeyEvent event) {
                p.k(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m2859isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m2857isCtrlPressedZmokQxo(event)) {
                    long jM2853getKeyZmokQxo = KeyEvent_androidKt.m2853getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m706getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m707getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m708getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m705getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m2857isCtrlPressedZmokQxo(event)) {
                    long jM2853getKeyZmokQxo2 = KeyEvent_androidKt.m2853getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m706getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m707getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m708getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m705getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m710getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m704getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m701getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m700getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m2859isShiftPressedZmokQxo(event)) {
                    long jM2853getKeyZmokQxo3 = KeyEvent_androidKt.m2853getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m713getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m712getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo687mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final l<? super KeyEvent, Boolean> lVar) {
        p.k(lVar, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo687mapZmokQxo(@NotNull android.view.KeyEvent event) {
                p.k(event, "event");
                if (lVar.invoke(KeyEvent.m2836boximpl(event)).booleanValue() && KeyEvent_androidKt.m2859isShiftPressedZmokQxo(event)) {
                    if (Key.m2258equalsimpl0(KeyEvent_androidKt.m2853getKeyZmokQxo(event), MappedKeys.INSTANCE.m720getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (lVar.invoke(KeyEvent.m2836boximpl(event)).booleanValue()) {
                    long jM2853getKeyZmokQxo = KeyEvent_androidKt.m2853getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m702getCEK5gGoQ()) ? true : Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m711getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m718getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m719getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m699getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo, mappedKeys.m720getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m2857isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m2859isShiftPressedZmokQxo(event)) {
                    long jM2853getKeyZmokQxo2 = KeyEvent_androidKt.m2853getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m706getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m707getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m708getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m705getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m715getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m714getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m713getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m712getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo2, mappedKeys2.m711getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM2853getKeyZmokQxo3 = KeyEvent_androidKt.m2853getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m706getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m707getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m708getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m705getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m715getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m714getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m713getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m712getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m709getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m701getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m704getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m716getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m703getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m2258equalsimpl0(jM2853getKeyZmokQxo3, mappedKeys3.m717getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
