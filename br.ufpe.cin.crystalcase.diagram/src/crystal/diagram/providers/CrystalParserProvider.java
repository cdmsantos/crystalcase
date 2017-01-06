/*
 * 
 */
package crystal.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import crystal.CrystalPackage;
import crystal.diagram.edit.parts.*;
import crystal.diagram.parsers.MessageFormatParser;
import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class CrystalParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser procedureName_5349Parser;

	/**
	* @generated
	*/
	private IParser getProcedureName_5349Parser() {
		if (procedureName_5349Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getNamedBlocks_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			procedureName_5349Parser = parser;
		}
		return procedureName_5349Parser;
	}

	/**
	* @generated
	*/
	private IParser functionName_5350Parser;

	/**
	* @generated
	*/
	private IParser getFunctionName_5350Parser() {
		if (functionName_5350Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getNamedBlocks_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			functionName_5350Parser = parser;
		}
		return functionName_5350Parser;
	}

	/**
	* @generated
	*/
	private IParser anonymousBlockDescription_5351Parser;

	/**
	* @generated
	*/
	private IParser getAnonymousBlockDescription_5351Parser() {
		if (anonymousBlockDescription_5351Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getAnonymousBlock_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anonymousBlockDescription_5351Parser = parser;
		}
		return anonymousBlockDescription_5351Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5244Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5244Parser() {
		if (expressionDescription_5244Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5244Parser = parser;
		}
		return expressionDescription_5244Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5245Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5245Parser() {
		if (exceptionDescription_5245Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5245Parser = parser;
		}
		return exceptionDescription_5245Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5327Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5327Parser() {
		if (ifDescription_5327Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5327Parser = parser;
		}
		return ifDescription_5327Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5246Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5246Parser() {
		if (expressionDescription_5246Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5246Parser = parser;
		}
		return expressionDescription_5246Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5247Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5247Parser() {
		if (exceptionDescription_5247Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5247Parser = parser;
		}
		return exceptionDescription_5247Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5326Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5326Parser() {
		if (ifDescription_5326Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5326Parser = parser;
		}
		return ifDescription_5326Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5325Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5325Parser() {
		if (caseDescription_5325Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5325Parser = parser;
		}
		return caseDescription_5325Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5248Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5248Parser() {
		if (expressionDescription_5248Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5248Parser = parser;
		}
		return expressionDescription_5248Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5249Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5249Parser() {
		if (exceptionDescription_5249Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5249Parser = parser;
		}
		return exceptionDescription_5249Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5324Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5324Parser() {
		if (ifDescription_5324Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5324Parser = parser;
		}
		return ifDescription_5324Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5250Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5250Parser() {
		if (insertDescription_5250Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5250Parser = parser;
		}
		return insertDescription_5250Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5251Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5251Parser() {
		if (updateDescription_5251Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5251Parser = parser;
		}
		return updateDescription_5251Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5252Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5252Parser() {
		if (deleteDescription_5252Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5252Parser = parser;
		}
		return deleteDescription_5252Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5253Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5253Parser() {
		if (selectDescription_5253Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5253Parser = parser;
		}
		return selectDescription_5253Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5323Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5323Parser() {
		if (whileDescription_5323Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5323Parser = parser;
		}
		return whileDescription_5323Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5254Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5254Parser() {
		if (expressionDescription_5254Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5254Parser = parser;
		}
		return expressionDescription_5254Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5255Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5255Parser() {
		if (exceptionDescription_5255Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5255Parser = parser;
		}
		return exceptionDescription_5255Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5322Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5322Parser() {
		if (ifDescription_5322Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5322Parser = parser;
		}
		return ifDescription_5322Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5321Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5321Parser() {
		if (forDescription_5321Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5321Parser = parser;
		}
		return forDescription_5321Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5320Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5320Parser() {
		if (caseDescription_5320Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5320Parser = parser;
		}
		return caseDescription_5320Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5319Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5319Parser() {
		if (caseDescription_5319Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5319Parser = parser;
		}
		return caseDescription_5319Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5256Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5256Parser() {
		if (insertDescription_5256Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5256Parser = parser;
		}
		return insertDescription_5256Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5257Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5257Parser() {
		if (updateDescription_5257Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5257Parser = parser;
		}
		return updateDescription_5257Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5258Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5258Parser() {
		if (deleteDescription_5258Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5258Parser = parser;
		}
		return deleteDescription_5258Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5259Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5259Parser() {
		if (selectDescription_5259Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5259Parser = parser;
		}
		return selectDescription_5259Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5272Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5272Parser() {
		if (whileDescription_5272Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5272Parser = parser;
		}
		return whileDescription_5272Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5260Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5260Parser() {
		if (insertDescription_5260Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5260Parser = parser;
		}
		return insertDescription_5260Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5261Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5261Parser() {
		if (updateDescription_5261Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5261Parser = parser;
		}
		return updateDescription_5261Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5262Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5262Parser() {
		if (deleteDescription_5262Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5262Parser = parser;
		}
		return deleteDescription_5262Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5263Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5263Parser() {
		if (selectDescription_5263Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5263Parser = parser;
		}
		return selectDescription_5263Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5271Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5271Parser() {
		if (whileDescription_5271Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5271Parser = parser;
		}
		return whileDescription_5271Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5270Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5270Parser() {
		if (forDescription_5270Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5270Parser = parser;
		}
		return forDescription_5270Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5269Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5269Parser() {
		if (loopDescription_5269Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5269Parser = parser;
		}
		return loopDescription_5269Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5264Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5264Parser() {
		if (openDescription_5264Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5264Parser = parser;
		}
		return openDescription_5264Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5265Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5265Parser() {
		if (fetchDescription_5265Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5265Parser = parser;
		}
		return fetchDescription_5265Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5266Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5266Parser() {
		if (closeDescription_5266Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5266Parser = parser;
		}
		return closeDescription_5266Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5267Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5267Parser() {
		if (callProcedureDescription_5267Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5267Parser = parser;
		}
		return callProcedureDescription_5267Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5268Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5268Parser() {
		if (callFunctionDescription_5268Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5268Parser = parser;
		}
		return callFunctionDescription_5268Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5273Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5273Parser() {
		if (forDescription_5273Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5273Parser = parser;
		}
		return forDescription_5273Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5274Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5274Parser() {
		if (loopDescription_5274Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5274Parser = parser;
		}
		return loopDescription_5274Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5275Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5275Parser() {
		if (openDescription_5275Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5275Parser = parser;
		}
		return openDescription_5275Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5276Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5276Parser() {
		if (fetchDescription_5276Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5276Parser = parser;
		}
		return fetchDescription_5276Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5277Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5277Parser() {
		if (closeDescription_5277Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5277Parser = parser;
		}
		return closeDescription_5277Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5278Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5278Parser() {
		if (callProcedureDescription_5278Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5278Parser = parser;
		}
		return callProcedureDescription_5278Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5279Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5279Parser() {
		if (callFunctionDescription_5279Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5279Parser = parser;
		}
		return callFunctionDescription_5279Parser;
	}

	/**
	* @generated
	*/
	private IParser optionsDescription_5318Parser;

	/**
	* @generated
	*/
	private IParser getOptionsDescription_5318Parser() {
		if (optionsDescription_5318Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getOptions_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			optionsDescription_5318Parser = parser;
		}
		return optionsDescription_5318Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5280Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5280Parser() {
		if (expressionDescription_5280Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5280Parser = parser;
		}
		return expressionDescription_5280Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5281Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5281Parser() {
		if (exceptionDescription_5281Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5281Parser = parser;
		}
		return exceptionDescription_5281Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5304Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5304Parser() {
		if (ifDescription_5304Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5304Parser = parser;
		}
		return ifDescription_5304Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5282Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5282Parser() {
		if (loopDescription_5282Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5282Parser = parser;
		}
		return loopDescription_5282Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5283Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5283Parser() {
		if (openDescription_5283Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5283Parser = parser;
		}
		return openDescription_5283Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5284Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5284Parser() {
		if (fetchDescription_5284Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5284Parser = parser;
		}
		return fetchDescription_5284Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5285Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5285Parser() {
		if (closeDescription_5285Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5285Parser = parser;
		}
		return closeDescription_5285Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5286Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5286Parser() {
		if (callProcedureDescription_5286Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5286Parser = parser;
		}
		return callProcedureDescription_5286Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5287Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5287Parser() {
		if (callFunctionDescription_5287Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5287Parser = parser;
		}
		return callFunctionDescription_5287Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5288Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5288Parser() {
		if (expressionDescription_5288Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5288Parser = parser;
		}
		return expressionDescription_5288Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5289Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5289Parser() {
		if (exceptionDescription_5289Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5289Parser = parser;
		}
		return exceptionDescription_5289Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5303Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5303Parser() {
		if (ifDescription_5303Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5303Parser = parser;
		}
		return ifDescription_5303Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5290Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5290Parser() {
		if (caseDescription_5290Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5290Parser = parser;
		}
		return caseDescription_5290Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5291Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5291Parser() {
		if (insertDescription_5291Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5291Parser = parser;
		}
		return insertDescription_5291Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5292Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5292Parser() {
		if (updateDescription_5292Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5292Parser = parser;
		}
		return updateDescription_5292Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5293Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5293Parser() {
		if (deleteDescription_5293Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5293Parser = parser;
		}
		return deleteDescription_5293Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5294Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5294Parser() {
		if (selectDescription_5294Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5294Parser = parser;
		}
		return selectDescription_5294Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5295Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5295Parser() {
		if (whileDescription_5295Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5295Parser = parser;
		}
		return whileDescription_5295Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5296Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5296Parser() {
		if (forDescription_5296Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5296Parser = parser;
		}
		return forDescription_5296Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5297Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5297Parser() {
		if (loopDescription_5297Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5297Parser = parser;
		}
		return loopDescription_5297Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5298Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5298Parser() {
		if (openDescription_5298Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5298Parser = parser;
		}
		return openDescription_5298Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5299Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5299Parser() {
		if (fetchDescription_5299Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5299Parser = parser;
		}
		return fetchDescription_5299Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5300Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5300Parser() {
		if (closeDescription_5300Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5300Parser = parser;
		}
		return closeDescription_5300Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5301Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5301Parser() {
		if (callProcedureDescription_5301Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5301Parser = parser;
		}
		return callProcedureDescription_5301Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5302Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5302Parser() {
		if (callFunctionDescription_5302Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5302Parser = parser;
		}
		return callFunctionDescription_5302Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5305Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5305Parser() {
		if (caseDescription_5305Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5305Parser = parser;
		}
		return caseDescription_5305Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5306Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5306Parser() {
		if (insertDescription_5306Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5306Parser = parser;
		}
		return insertDescription_5306Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5307Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5307Parser() {
		if (updateDescription_5307Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5307Parser = parser;
		}
		return updateDescription_5307Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5308Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5308Parser() {
		if (deleteDescription_5308Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5308Parser = parser;
		}
		return deleteDescription_5308Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5309Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5309Parser() {
		if (selectDescription_5309Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5309Parser = parser;
		}
		return selectDescription_5309Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5310Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5310Parser() {
		if (whileDescription_5310Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5310Parser = parser;
		}
		return whileDescription_5310Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5311Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5311Parser() {
		if (forDescription_5311Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5311Parser = parser;
		}
		return forDescription_5311Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5312Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5312Parser() {
		if (loopDescription_5312Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5312Parser = parser;
		}
		return loopDescription_5312Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5313Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5313Parser() {
		if (openDescription_5313Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5313Parser = parser;
		}
		return openDescription_5313Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5314Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5314Parser() {
		if (fetchDescription_5314Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5314Parser = parser;
		}
		return fetchDescription_5314Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5315Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5315Parser() {
		if (closeDescription_5315Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5315Parser = parser;
		}
		return closeDescription_5315Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5316Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5316Parser() {
		if (callProcedureDescription_5316Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5316Parser = parser;
		}
		return callProcedureDescription_5316Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5317Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5317Parser() {
		if (callFunctionDescription_5317Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5317Parser = parser;
		}
		return callFunctionDescription_5317Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5328Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5328Parser() {
		if (caseDescription_5328Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5328Parser = parser;
		}
		return caseDescription_5328Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5329Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5329Parser() {
		if (insertDescription_5329Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5329Parser = parser;
		}
		return insertDescription_5329Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5330Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5330Parser() {
		if (updateDescription_5330Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5330Parser = parser;
		}
		return updateDescription_5330Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5331Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5331Parser() {
		if (deleteDescription_5331Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5331Parser = parser;
		}
		return deleteDescription_5331Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5332Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5332Parser() {
		if (selectDescription_5332Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5332Parser = parser;
		}
		return selectDescription_5332Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5333Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5333Parser() {
		if (whileDescription_5333Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5333Parser = parser;
		}
		return whileDescription_5333Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5334Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5334Parser() {
		if (forDescription_5334Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5334Parser = parser;
		}
		return forDescription_5334Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5335Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5335Parser() {
		if (loopDescription_5335Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5335Parser = parser;
		}
		return loopDescription_5335Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5336Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5336Parser() {
		if (openDescription_5336Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5336Parser = parser;
		}
		return openDescription_5336Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5337Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5337Parser() {
		if (fetchDescription_5337Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5337Parser = parser;
		}
		return fetchDescription_5337Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5338Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5338Parser() {
		if (closeDescription_5338Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5338Parser = parser;
		}
		return closeDescription_5338Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5339Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5339Parser() {
		if (callProcedureDescription_5339Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5339Parser = parser;
		}
		return callProcedureDescription_5339Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5340Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5340Parser() {
		if (callFunctionDescription_5340Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5340Parser = parser;
		}
		return callFunctionDescription_5340Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeName_5341Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeName_5341Parser() {
		if (dataTypeName_5341Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5341Parser = parser;
		}
		return dataTypeName_5341Parser;
	}

	/**
	* @generated
	*/
	private IParser collectionsName_5342Parser;

	/**
	* @generated
	*/
	private IParser getCollectionsName_5342Parser() {
		if (collectionsName_5342Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5342Parser = parser;
		}
		return collectionsName_5342Parser;
	}

	/**
	* @generated
	*/
	private IParser recordsName_5343Parser;

	/**
	* @generated
	*/
	private IParser getRecordsName_5343Parser() {
		if (recordsName_5343Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5343Parser = parser;
		}
		return recordsName_5343Parser;
	}

	/**
	* @generated
	*/
	private IParser cursorName_5344Parser;

	/**
	* @generated
	*/
	private IParser getCursorName_5344Parser() {
		if (cursorName_5344Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5344Parser = parser;
		}
		return cursorName_5344Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeName_5345Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeName_5345Parser() {
		if (dataTypeName_5345Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5345Parser = parser;
		}
		return dataTypeName_5345Parser;
	}

	/**
	* @generated
	*/
	private IParser collectionsName_5346Parser;

	/**
	* @generated
	*/
	private IParser getCollectionsName_5346Parser() {
		if (collectionsName_5346Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5346Parser = parser;
		}
		return collectionsName_5346Parser;
	}

	/**
	* @generated
	*/
	private IParser recordsName_5347Parser;

	/**
	* @generated
	*/
	private IParser getRecordsName_5347Parser() {
		if (recordsName_5347Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5347Parser = parser;
		}
		return recordsName_5347Parser;
	}

	/**
	* @generated
	*/
	private IParser cursorName_5348Parser;

	/**
	* @generated
	*/
	private IParser getCursorName_5348Parser() {
		if (cursorName_5348Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5348Parser = parser;
		}
		return cursorName_5348Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeName_5027Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeName_5027Parser() {
		if (dataTypeName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5027Parser = parser;
		}
		return dataTypeName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser collectionsName_5028Parser;

	/**
	* @generated
	*/
	private IParser getCollectionsName_5028Parser() {
		if (collectionsName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5028Parser = parser;
		}
		return collectionsName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser recordsName_5029Parser;

	/**
	* @generated
	*/
	private IParser getRecordsName_5029Parser() {
		if (recordsName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5029Parser = parser;
		}
		return recordsName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser cursorName_5030Parser;

	/**
	* @generated
	*/
	private IParser getCursorName_5030Parser() {
		if (cursorName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getDataAbstractions_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5030Parser = parser;
		}
		return cursorName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser transitionName_6001Parser;

	/**
	* @generated
	*/
	private IParser getTransitionName_6001Parser() {
		if (transitionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getLinks_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionName_6001Parser = parser;
		}
		return transitionName_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser optionsTransitionName_6003Parser;

	/**
	* @generated
	*/
	private IParser getOptionsTransitionName_6003Parser() {
		if (optionsTransitionName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getLinks_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			optionsTransitionName_6003Parser = parser;
		}
		return optionsTransitionName_6003Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProcedureNameEditPart.VISUAL_ID:
			return getProcedureName_5349Parser();
		case FunctionNameEditPart.VISUAL_ID:
			return getFunctionName_5350Parser();
		case AnonymousBlockDescriptionEditPart.VISUAL_ID:
			return getAnonymousBlockDescription_5351Parser();
		case ExpressionDescriptionEditPart.VISUAL_ID:
			return getExpressionDescription_5244Parser();
		case ExceptionDescriptionEditPart.VISUAL_ID:
			return getExceptionDescription_5245Parser();
		case IfDescriptionEditPart.VISUAL_ID:
			return getIfDescription_5327Parser();
		case ExpressionDescription2EditPart.VISUAL_ID:
			return getExpressionDescription_5246Parser();
		case ExceptionDescription2EditPart.VISUAL_ID:
			return getExceptionDescription_5247Parser();
		case IfDescription2EditPart.VISUAL_ID:
			return getIfDescription_5326Parser();
		case CaseDescriptionEditPart.VISUAL_ID:
			return getCaseDescription_5325Parser();
		case ExpressionDescription3EditPart.VISUAL_ID:
			return getExpressionDescription_5248Parser();
		case ExceptionDescription3EditPart.VISUAL_ID:
			return getExceptionDescription_5249Parser();
		case IfDescription3EditPart.VISUAL_ID:
			return getIfDescription_5324Parser();
		case InsertDescriptionEditPart.VISUAL_ID:
			return getInsertDescription_5250Parser();
		case UpdateDescriptionEditPart.VISUAL_ID:
			return getUpdateDescription_5251Parser();
		case DeleteDescriptionEditPart.VISUAL_ID:
			return getDeleteDescription_5252Parser();
		case SelectDescriptionEditPart.VISUAL_ID:
			return getSelectDescription_5253Parser();
		case WhileDescriptionEditPart.VISUAL_ID:
			return getWhileDescription_5323Parser();
		case ExpressionDescription4EditPart.VISUAL_ID:
			return getExpressionDescription_5254Parser();
		case ExceptionDescription4EditPart.VISUAL_ID:
			return getExceptionDescription_5255Parser();
		case IfDescription4EditPart.VISUAL_ID:
			return getIfDescription_5322Parser();
		case ForDescriptionEditPart.VISUAL_ID:
			return getForDescription_5321Parser();
		case CaseDescription2EditPart.VISUAL_ID:
			return getCaseDescription_5320Parser();
		case CaseDescription3EditPart.VISUAL_ID:
			return getCaseDescription_5319Parser();
		case InsertDescription2EditPart.VISUAL_ID:
			return getInsertDescription_5256Parser();
		case UpdateDescription2EditPart.VISUAL_ID:
			return getUpdateDescription_5257Parser();
		case DeleteDescription2EditPart.VISUAL_ID:
			return getDeleteDescription_5258Parser();
		case SelectDescription2EditPart.VISUAL_ID:
			return getSelectDescription_5259Parser();
		case WhileDescription2EditPart.VISUAL_ID:
			return getWhileDescription_5272Parser();
		case InsertDescription3EditPart.VISUAL_ID:
			return getInsertDescription_5260Parser();
		case UpdateDescription3EditPart.VISUAL_ID:
			return getUpdateDescription_5261Parser();
		case DeleteDescription3EditPart.VISUAL_ID:
			return getDeleteDescription_5262Parser();
		case SelectDescription3EditPart.VISUAL_ID:
			return getSelectDescription_5263Parser();
		case WhileDescription3EditPart.VISUAL_ID:
			return getWhileDescription_5271Parser();
		case ForDescription2EditPart.VISUAL_ID:
			return getForDescription_5270Parser();
		case LoopDescriptionEditPart.VISUAL_ID:
			return getLoopDescription_5269Parser();
		case OpenDescriptionEditPart.VISUAL_ID:
			return getOpenDescription_5264Parser();
		case FetchDescriptionEditPart.VISUAL_ID:
			return getFetchDescription_5265Parser();
		case CloseDescriptionEditPart.VISUAL_ID:
			return getCloseDescription_5266Parser();
		case CallProcedureDescriptionEditPart.VISUAL_ID:
			return getCallProcedureDescription_5267Parser();
		case CallFunctionDescriptionEditPart.VISUAL_ID:
			return getCallFunctionDescription_5268Parser();
		case ForDescription3EditPart.VISUAL_ID:
			return getForDescription_5273Parser();
		case LoopDescription2EditPart.VISUAL_ID:
			return getLoopDescription_5274Parser();
		case OpenDescription2EditPart.VISUAL_ID:
			return getOpenDescription_5275Parser();
		case FetchDescription2EditPart.VISUAL_ID:
			return getFetchDescription_5276Parser();
		case CloseDescription2EditPart.VISUAL_ID:
			return getCloseDescription_5277Parser();
		case CallProcedureDescription2EditPart.VISUAL_ID:
			return getCallProcedureDescription_5278Parser();
		case CallFunctionDescription2EditPart.VISUAL_ID:
			return getCallFunctionDescription_5279Parser();
		case OptionsDescriptionEditPart.VISUAL_ID:
			return getOptionsDescription_5318Parser();
		case ExpressionDescription5EditPart.VISUAL_ID:
			return getExpressionDescription_5280Parser();
		case ExceptionDescription5EditPart.VISUAL_ID:
			return getExceptionDescription_5281Parser();
		case IfDescription5EditPart.VISUAL_ID:
			return getIfDescription_5304Parser();
		case LoopDescription3EditPart.VISUAL_ID:
			return getLoopDescription_5282Parser();
		case OpenDescription3EditPart.VISUAL_ID:
			return getOpenDescription_5283Parser();
		case FetchDescription3EditPart.VISUAL_ID:
			return getFetchDescription_5284Parser();
		case CloseDescription3EditPart.VISUAL_ID:
			return getCloseDescription_5285Parser();
		case CallProcedureDescription3EditPart.VISUAL_ID:
			return getCallProcedureDescription_5286Parser();
		case CallFunctionDescription3EditPart.VISUAL_ID:
			return getCallFunctionDescription_5287Parser();
		case ExpressionDescription6EditPart.VISUAL_ID:
			return getExpressionDescription_5288Parser();
		case ExceptionDescription6EditPart.VISUAL_ID:
			return getExceptionDescription_5289Parser();
		case IfDescription6EditPart.VISUAL_ID:
			return getIfDescription_5303Parser();
		case CaseDescription4EditPart.VISUAL_ID:
			return getCaseDescription_5290Parser();
		case InsertDescription4EditPart.VISUAL_ID:
			return getInsertDescription_5291Parser();
		case UpdateDescription4EditPart.VISUAL_ID:
			return getUpdateDescription_5292Parser();
		case DeleteDescription4EditPart.VISUAL_ID:
			return getDeleteDescription_5293Parser();
		case SelectDescription4EditPart.VISUAL_ID:
			return getSelectDescription_5294Parser();
		case WhileDescription4EditPart.VISUAL_ID:
			return getWhileDescription_5295Parser();
		case ForDescription4EditPart.VISUAL_ID:
			return getForDescription_5296Parser();
		case LoopDescription4EditPart.VISUAL_ID:
			return getLoopDescription_5297Parser();
		case OpenDescription4EditPart.VISUAL_ID:
			return getOpenDescription_5298Parser();
		case FetchDescription4EditPart.VISUAL_ID:
			return getFetchDescription_5299Parser();
		case CloseDescription4EditPart.VISUAL_ID:
			return getCloseDescription_5300Parser();
		case CallProcedureDescription4EditPart.VISUAL_ID:
			return getCallProcedureDescription_5301Parser();
		case CallFunctionDescription4EditPart.VISUAL_ID:
			return getCallFunctionDescription_5302Parser();
		case CaseDescription5EditPart.VISUAL_ID:
			return getCaseDescription_5305Parser();
		case InsertDescription5EditPart.VISUAL_ID:
			return getInsertDescription_5306Parser();
		case UpdateDescription5EditPart.VISUAL_ID:
			return getUpdateDescription_5307Parser();
		case DeleteDescription5EditPart.VISUAL_ID:
			return getDeleteDescription_5308Parser();
		case SelectDescription5EditPart.VISUAL_ID:
			return getSelectDescription_5309Parser();
		case WhileDescription5EditPart.VISUAL_ID:
			return getWhileDescription_5310Parser();
		case ForDescription5EditPart.VISUAL_ID:
			return getForDescription_5311Parser();
		case LoopDescription5EditPart.VISUAL_ID:
			return getLoopDescription_5312Parser();
		case OpenDescription5EditPart.VISUAL_ID:
			return getOpenDescription_5313Parser();
		case FetchDescription5EditPart.VISUAL_ID:
			return getFetchDescription_5314Parser();
		case CloseDescription5EditPart.VISUAL_ID:
			return getCloseDescription_5315Parser();
		case CallProcedureDescription5EditPart.VISUAL_ID:
			return getCallProcedureDescription_5316Parser();
		case CallFunctionDescription5EditPart.VISUAL_ID:
			return getCallFunctionDescription_5317Parser();
		case CaseDescription6EditPart.VISUAL_ID:
			return getCaseDescription_5328Parser();
		case InsertDescription6EditPart.VISUAL_ID:
			return getInsertDescription_5329Parser();
		case UpdateDescription6EditPart.VISUAL_ID:
			return getUpdateDescription_5330Parser();
		case DeleteDescription6EditPart.VISUAL_ID:
			return getDeleteDescription_5331Parser();
		case SelectDescription6EditPart.VISUAL_ID:
			return getSelectDescription_5332Parser();
		case WhileDescription6EditPart.VISUAL_ID:
			return getWhileDescription_5333Parser();
		case ForDescription6EditPart.VISUAL_ID:
			return getForDescription_5334Parser();
		case LoopDescription6EditPart.VISUAL_ID:
			return getLoopDescription_5335Parser();
		case OpenDescription6EditPart.VISUAL_ID:
			return getOpenDescription_5336Parser();
		case FetchDescription6EditPart.VISUAL_ID:
			return getFetchDescription_5337Parser();
		case CloseDescription6EditPart.VISUAL_ID:
			return getCloseDescription_5338Parser();
		case CallProcedureDescription6EditPart.VISUAL_ID:
			return getCallProcedureDescription_5339Parser();
		case CallFunctionDescription6EditPart.VISUAL_ID:
			return getCallFunctionDescription_5340Parser();
		case DataTypeNameEditPart.VISUAL_ID:
			return getDataTypeName_5341Parser();
		case CollectionsNameEditPart.VISUAL_ID:
			return getCollectionsName_5342Parser();
		case RecordsNameEditPart.VISUAL_ID:
			return getRecordsName_5343Parser();
		case CursorNameEditPart.VISUAL_ID:
			return getCursorName_5344Parser();
		case DataTypeName2EditPart.VISUAL_ID:
			return getDataTypeName_5345Parser();
		case CollectionsName2EditPart.VISUAL_ID:
			return getCollectionsName_5346Parser();
		case RecordsName2EditPart.VISUAL_ID:
			return getRecordsName_5347Parser();
		case CursorName2EditPart.VISUAL_ID:
			return getCursorName_5348Parser();
		case DataTypeName3EditPart.VISUAL_ID:
			return getDataTypeName_5027Parser();
		case CollectionsName3EditPart.VISUAL_ID:
			return getCollectionsName_5028Parser();
		case RecordsName3EditPart.VISUAL_ID:
			return getRecordsName_5029Parser();
		case CursorName3EditPart.VISUAL_ID:
			return getCursorName_5030Parser();
		case TransitionNameEditPart.VISUAL_ID:
			return getTransitionName_6001Parser();
		case OptionsTransitionNameEditPart.VISUAL_ID:
			return getOptionsTransitionName_6003Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CrystalVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CrystalVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CrystalElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
