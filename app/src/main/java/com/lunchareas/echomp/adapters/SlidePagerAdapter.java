/*
Echo Music Player
Copyright (C) 2019 David Zhang

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.lunchareas.echomp.adapters;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lunchareas.echomp.fragments.AlbumFragment;
import com.lunchareas.echomp.fragments.ArtistFragment;
import com.lunchareas.echomp.fragments.SongFragment;
import com.lunchareas.echomp.fragments.PlaylistFragment;


public class SlidePagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = SlidePagerAdapter.class.getName();
    private static final int NUM_PAGES = 4;
    private static final String[] tabTitles = new String[] {"Tracks", "Playlists", "Albums", "Artists"};

    private Activity activity;

    public SlidePagerAdapter(FragmentManager fragmentManager, Activity activity) {
        super(fragmentManager);
        this.activity = activity;
    }

    @Override
    public Fragment getItem(int pos) {

        // Different fragments for each pos
        switch (pos) {
            case 0:
                return new SongFragment();
            case 1:
                return new PlaylistFragment();
            case 2:
                return new AlbumFragment();
            case 3:
                return new ArtistFragment();
        }

        return null;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
