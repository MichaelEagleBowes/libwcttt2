/*
 * WCT³ (WIAI Course Timetabling Tool) is a software that strives to automate
 * the timetabling process at the WIAI faculty of the University of Bamberg.
 *
 * libwcttt comprises the data model, a binder (parser + emitter) to store the
 * data as XML files, the implementations of the algorithms as well as
 * functionality to calculate conflicts and their violations.
 *
 * Copyright (C) 2018 Nicolas Gross
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
 *
 */

package wcttt.lib.algorithms.tabu_based_memetic_approach;

import wcttt.lib.algorithms.WctttAlgorithmException;
import wcttt.lib.model.Semester;
import wcttt.lib.model.Timetable;

/**
 * Defines the functionality of a neighborhood structure.
 */
public interface NeighborhoodStructure {

	void apply(Timetable timetable, Semester semester)
			throws WctttAlgorithmException;
}
