package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanOperatorKind;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.concurrent.xarduino.arduino.Expression;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.VariableRef_EvaluableAspect;

@Aspect(className = BinaryBooleanExpression.class, with = { BooleanExpression_EvaluableAspect.class })
@SuppressWarnings("all")
public class BinaryBooleanExpression_EvaluableAspect extends BooleanExpression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BinaryBooleanExpression _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Expression){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final BinaryBooleanExpression _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties _self_, final BinaryBooleanExpression _self) {
    boolean leftIsBoolean = false;
    boolean rightIsBoolean = false;
    Boolean res = null;
    boolean bLeft = false;
    int iLeft = 0;
    Expression _left = _self.getLeft();
    boolean _matched = false;
    if (!_matched) {
      if (_left instanceof BinaryBooleanExpression) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_left_1);
        bLeft = (((Boolean) _evaluate)).booleanValue();
        leftIsBoolean = true;
      }
    }
    if (!_matched) {
      if (_left instanceof BinaryIntegerExpression) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = BinaryIntegerExpression_EvaluableAspect.evaluate(_left_1);
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched) {
      if (_left instanceof IntegerVariableRef) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_left_1);
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched) {
      if (_left instanceof BooleanVariableRef) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_left_1);
        bLeft = (((Boolean) _evaluate)).booleanValue();
        leftIsBoolean = true;
      }
    }
    if (!_matched) {
      if (_left instanceof IntegerConstant) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = IntegerConstant_ExecutableAspect.evaluate(_left_1);
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched) {
      if (_left instanceof BooleanConstant) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = BooleanConstant_ExecutableAspect.evaluate(_left_1);
        bLeft = (((Boolean) _evaluate)).booleanValue();
        leftIsBoolean = true;
      }
    }
    if (!_matched) {
      if (_left instanceof IntegerModuleGet) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = IntegerModuleGet_ExecutableAspect.evaluate(_left_1);
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched) {
      if (_left instanceof BooleanModuleGet) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = BooleanModuleGet_ExecutableAspect.evaluate(_left_1);
        bLeft = (((Boolean) _evaluate)).booleanValue();
        leftIsBoolean = true;
      }
    }
    boolean bRight = false;
    int iRight = 0;
    Expression _right = _self.getRight();
    boolean _matched_1 = false;
    if (!_matched_1) {
      if (_right instanceof BinaryBooleanExpression) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_right_1);
        bRight = (((Boolean) _evaluate)).booleanValue();
        rightIsBoolean = true;
      }
    }
    if (!_matched_1) {
      if (_right instanceof BinaryIntegerExpression) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = BinaryIntegerExpression_EvaluableAspect.evaluate(_right_1);
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof IntegerVariableRef) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_right_1);
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof BooleanVariableRef) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_right_1);
        bRight = (((Boolean) _evaluate)).booleanValue();
        rightIsBoolean = true;
      }
    }
    if (!_matched_1) {
      if (_right instanceof IntegerConstant) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = IntegerConstant_ExecutableAspect.evaluate(_right_1);
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof BooleanConstant) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = BooleanConstant_ExecutableAspect.evaluate(_right_1);
        bRight = (((Boolean) _evaluate)).booleanValue();
        rightIsBoolean = true;
      }
    }
    if (!_matched_1) {
      if (_right instanceof IntegerModuleGet) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = IntegerModuleGet_ExecutableAspect.evaluate(_right_1);
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof BooleanModuleGet) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = BooleanModuleGet_ExecutableAspect.evaluate(_right_1);
        bRight = (((Boolean) _evaluate)).booleanValue();
        rightIsBoolean = true;
      }
    }
    if ((leftIsBoolean != rightIsBoolean)) {
      throw new IllegalArgumentException("left operand type does not match right operand type.");
    }
    BinaryBooleanOperatorKind _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case AND:
          if (bLeft) {
            res = Boolean.valueOf(bRight);
          } else {
            res = Boolean.FALSE;
          }
          break;
        case OR:
          if (bLeft) {
            res = Boolean.TRUE;
          } else {
            res = Boolean.valueOf(bRight);
          }
          break;
        case DIFFERENT:
          boolean _equals = Boolean.valueOf(bLeft).equals(Boolean.valueOf(bRight));
          boolean _not = (!_equals);
          res = Boolean.valueOf(_not);
          break;
        case EQUAL:
          if (leftIsBoolean) {
            boolean _equals_1 = Boolean.valueOf(bLeft).equals(Boolean.valueOf(bRight));
            res = Boolean.valueOf(_equals_1);
          } else {
            boolean _equals_2 = Integer.valueOf(iLeft).equals(Integer.valueOf(iRight));
            res = Boolean.valueOf(_equals_2);
          }
          break;
        case INF:
          res = Boolean.valueOf((iLeft < iRight));
          break;
        case INF_OR_EQUAL:
          res = Boolean.valueOf((iLeft <= iRight));
          break;
        case SUP:
          res = Boolean.valueOf((iLeft > iRight));
          break;
        case SUP_OR_EQUAL:
          res = Boolean.valueOf((iLeft >= iRight));
          break;
        default:
          BinaryBooleanOperatorKind _operator_1 = _self.getOperator();
          String _plus = ("Operator " + _operator_1);
          String _plus_1 = (_plus + " not simulated yet.");
          throw new IllegalStateException(_plus_1);
      }
    } else {
      BinaryBooleanOperatorKind _operator_1 = _self.getOperator();
      String _plus = ("Operator " + _operator_1);
      String _plus_1 = (_plus + " not simulated yet.");
      throw new IllegalStateException(_plus_1);
    }
    return res;
  }
}
