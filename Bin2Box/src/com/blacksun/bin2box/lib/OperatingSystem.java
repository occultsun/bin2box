/*
 *   (c) 2010-2016 Ruan K. F <ruan.klein@gmail.com>
 *   All Rights Reserved.
 *   This file is part of Bin2Box.
 *
 *   Bin2Box is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Bin2Box is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.blacksun.bin2box.lib;

/**
 *
 * @author ruan
 */
public class OperatingSystem {
    
    private static final String OS = System.getProperty("os.name").toLowerCase();
    
    public static boolean isWindows() {
        return OS.contains("win");
    }
    
    public static boolean isOSX() {
        return OS.contains("mac");
    }
    
    public static boolean isLinux() {
        return OS.contains("nux");
    }
    
}