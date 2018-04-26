/**
 * Copyright (C) 2011-2014 Swinburne University of Technology and University of Gotheborg
 *
 * These file have been developed as a part of the co4robots project.
 * It is a tool
 *
 * These files are based on PSPWizard which was developed at Faculty of Science, Engineering and
 * Technology at Swinburne University of Technology, Australia.
 * The patterns, structured English grammar and mappings are due to
 * Marco Autili, Universita` dell'Aquila
 * Lars Grunske, University of Stuttgart
 * Markus Lumpe, Swinburne University of Technology
 * Patrizio Pelliccione, University of Gothenburg
 * Antony Tang, Swinburne University of Technology
 *
 * Details about the PSP framework can found in
 * "Aligning Qualitative, Real-Time, and Probabilistic
 * Property Specification Patterns Using a Structured
 * English Grammar"
 *
 *
 *
 * PSPWizard is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * PSPWizard is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PSPWizard; see the file COPYING.  If not, write to
 * the Free Software Foundation, 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package se.got.sel.patterns.occurrence;

import se.got.constraints.ProbabilityBound;
import se.got.constraints.TimeBound;
import se.got.constraints.UpperTimeBound;
import se.got.engine.PSPConstants;
import se.got.sel.Event;
import se.got.sel.patterns.Occurrence;

public class MaximumDuration extends Occurrence
{
    public MaximumDuration()
    {
        this( Event.getDefault(), 0, null, null );
    }

    private long fUpperLimit;

    public long getUpperLimit()
    {
        return fUpperLimit;
    }

    public void setUpperLimit( long aUpperLimit )
    {
        fUpperLimit = aUpperLimit;
    }

    public TimeBound getPTimeBound()
    {
        return new UpperTimeBound( getP(), fUpperLimit, fTimeUnit );
    }

    private String fTimeUnit;

    public String getTimeUnit()
    {
        return fTimeUnit;
    }
    
    public void setTimeUnit( String aTimeUnit )
    {
        fTimeUnit = aTimeUnit;
    }
    
    public MaximumDuration( Event aEventP, long aUpperLimit, String aTimeUnit, ProbabilityBound aProbBound )
    {
        super( aEventP, null, aProbBound );

        fUpperLimit = aUpperLimit;
        
        if ( aTimeUnit == null )
            fTimeUnit = "time units";
        else
            fTimeUnit = aTimeUnit;
    }
    
    public int getType() 
    {
        return PSPConstants.P_MaximumDuration;
    }

    public String getSpecificationAsSEL() 
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append( "once " );
        sb.append( getP().getAsSELEvent() );
        sb.append( " [becomes satisfied]" );
        sb.append( " it remains so" );

        sb.append( " for less than " );
        if ( fUpperLimit == Long.MAX_VALUE )
            sb.append( "∞" );
        else
            sb.append( fUpperLimit );
        sb.append( " " );
        sb.append( fTimeUnit );
        
        if ( getProbabilityBound() != null )
        {
            sb.append( " " );
            sb.append( getProbabilityBound().getSpecificationAsSEL() );
        }
        
        return sb.toString();
    }
}
