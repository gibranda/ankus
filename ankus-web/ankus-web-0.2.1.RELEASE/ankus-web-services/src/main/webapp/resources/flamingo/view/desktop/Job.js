/*
 * Copyright (C) 2011  Flamingo Project (http://www.opencloudengine.org).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

Ext.define('Flamingo.view.desktop.Job', {
    extend: 'Flamingo.view.desktop.ux.Module',

    requires: [
        'Flamingo.view.job.Viewport'
    ],

    id: 'job-scheduling-win',

    tipWidth: 160,
    tipHeight: 96,

    init: function () {
        this.launcher = {
            text: MSG.MENU_JOB_MANAGEMENT,
            iconCls: 'bogus'
        }
    },

    createWindow: function () {
        var me = this, desktop = me.app.getDesktop(),
            win = desktop.getWindow(me.id);

        if (!win) {
            win = desktop.createWindow({
                id: me.id,
                title: MSG.MENU_JOB_MANAGEMENT,
                width: 950,
                height: 500,
                iconCls: 'desktop-dashboard-small',
                animCollapse: false,
                closeAction: 'hide',
                border: false,
                layout: 'fit',
//                manual: MANUAL.JOB,
                items: {
                    xtype: 'jobViewport'
                }
            });
        }

        return win;
    }
});

