package androidx.navigation.ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: NavigationView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/google/android/material/navigation/NavigationView;", "Landroidx/navigation/NavController;", "navController", "Lbn/r;", "setupWithNavController", "navigation-ui_release"}, k = 2, mv = {1, 6, 0})
public final class NavigationViewKt {
    public static final void setupWithNavController(@NotNull NavigationView navigationView, @NotNull NavController navController) {
        p.k(navigationView, "<this>");
        p.k(navController, "navController");
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}
