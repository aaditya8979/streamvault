package androidx.compose.ui.text.intl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidLocaleDelegate.android.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "javaLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "getJavaLocale", "()Ljava/util/Locale;", "language", "", "getLanguage", "()Ljava/lang/String;", "region", "getRegion", "script", "getScript", "toLanguageTag", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidLocale implements PlatformLocale {

    @NotNull
    private final java.util.Locale javaLocale;

    public AndroidLocale(@NotNull java.util.Locale locale) {
        p.k(locale, "javaLocale");
        this.javaLocale = locale;
    }

    @NotNull
    public final java.util.Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getLanguage() {
        String language = this.javaLocale.getLanguage();
        p.j(language, "javaLocale.language");
        return language;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getRegion() {
        String country = this.javaLocale.getCountry();
        p.j(country, "javaLocale.country");
        return country;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getScript() {
        String script = this.javaLocale.getScript();
        p.j(script, "javaLocale.script");
        return script;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String toLanguageTag() {
        String languageTag = this.javaLocale.toLanguageTag();
        p.j(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
