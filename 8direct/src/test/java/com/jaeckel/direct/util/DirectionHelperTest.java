package com.jaeckel.direct.util;

import com.jaeckel.direct.R;
import com.jaeckel.direct.testrunner.FilteredRobolectricRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author flashmop
 * @date 30.06.13 15:54
 */
@RunWith(FilteredRobolectricRunner.class)
public class DirectionHelperTest {

    @Test
    @Config(qualifiers = "xhdpi")
    public void shouldReturnImageResource() {

        int result = DirectionHelper.getDirectionImage("n");
        assertThat(result, equalTo(R.drawable.portal_n));

        result = DirectionHelper.getDirectionImage("ne");
        assertThat(result, equalTo(R.drawable.portal_ne));

        result = DirectionHelper.getDirectionImage("e");
        assertThat(result, equalTo(R.drawable.portal_e));

        result = DirectionHelper.getDirectionImage("se");
        assertThat(result, equalTo(R.drawable.portal_se));

        result = DirectionHelper.getDirectionImage("s");
        assertThat(result, equalTo(R.drawable.portal_s));

        result = DirectionHelper.getDirectionImage("sw");
        assertThat(result, equalTo(R.drawable.portal_sw));

        result = DirectionHelper.getDirectionImage("w");
        assertThat(result, equalTo(R.drawable.portal_w));

        result = DirectionHelper.getDirectionImage("nw");
        assertThat(result, equalTo(R.drawable.portal_nw));
    }

    @Test
    @Config(qualifiers = "xhdpi")
    public void shouldReturnIconResource() {

        int result = DirectionHelper.getDirectionIcon("n");
        assertThat(result, equalTo(R.drawable.ic_stat_n));

        result = DirectionHelper.getDirectionIcon("ne");
        assertThat(result, equalTo(R.drawable.ic_stat_ne));

        result = DirectionHelper.getDirectionIcon("e");
        assertThat(result, equalTo(R.drawable.ic_stat_e));

        result = DirectionHelper.getDirectionIcon("se");
        assertThat(result, equalTo(R.drawable.ic_stat_se));

        result = DirectionHelper.getDirectionIcon("s");
        assertThat(result, equalTo(R.drawable.ic_stat_s));

        result = DirectionHelper.getDirectionIcon("sw");
        assertThat(result, equalTo(R.drawable.ic_stat_sw));

        result = DirectionHelper.getDirectionIcon("w");
        assertThat(result, equalTo(R.drawable.ic_stat_w));

        result = DirectionHelper.getDirectionIcon("nw");
        assertThat(result, equalTo(R.drawable.ic_stat_nw));
    }


}
