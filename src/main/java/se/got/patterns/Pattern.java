package se.got.patterns;

import se.got.patterns.visitor.PatternVisitor;

public abstract class Pattern {
	
	public abstract <T> T accept(PatternVisitor<T> visitor);


}
