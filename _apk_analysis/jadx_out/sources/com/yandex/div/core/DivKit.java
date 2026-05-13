package com.yandex.div.core;

import android.content.Context;
import androidx.annotation.AnyThread;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivKit.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivKit {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final DivKitConfiguration DEFAULT_CONFIGURATION = new DivKitConfiguration.Builder().build();

    @Nullable
    private static DivKitConfiguration configuration;

    @Nullable
    private static volatile DivKit instance;

    @NotNull
    private final DivKitComponent component;

    /* JADX INFO: compiled from: DivKit.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @AnyThread
        @NotNull
        public final DivKit getInstance(@NotNull Context context) {
            DivKit divKit = DivKit.instance;
            if (divKit != null) {
                return divKit;
            }
            synchronized (this) {
                DivKit divKit2 = DivKit.instance;
                if (divKit2 != null) {
                    return divKit2;
                }
                DivKitConfiguration divKitConfiguration = DivKit.configuration;
                if (divKitConfiguration == null) {
                    divKitConfiguration = DivKit.DEFAULT_CONFIGURATION;
                }
                DivKit divKit3 = new DivKit(context, divKitConfiguration, null);
                DivKit.instance = divKit3;
                return divKit3;
            }
        }

        @NotNull
        public final String getVersionName() {
            return "32.18.1";
        }
    }

    private DivKit(Context context, DivKitConfiguration divKitConfiguration) {
        this.component = Yatagan$DivKitComponent.builder().applicationContext(context.getApplicationContext()).configuration(divKitConfiguration).build();
    }

    public /* synthetic */ DivKit(Context context, DivKitConfiguration divKitConfiguration, i iVar) {
        this(context, divKitConfiguration);
    }

    @NotNull
    public final DivKitComponent getComponent$div_release() {
        return this.component;
    }
}
