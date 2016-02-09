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
import crystal.diagram.edit.parts.AnonymousBlockNameEditPart;
import crystal.diagram.edit.parts.CallFunctionDescriptionEditPart;
import crystal.diagram.edit.parts.CallProcedureDescriptionEditPart;
import crystal.diagram.edit.parts.CaseDescriptionEditPart;
import crystal.diagram.edit.parts.CloseDescriptionEditPart;
import crystal.diagram.edit.parts.CollectionsName2EditPart;
import crystal.diagram.edit.parts.CollectionsName3EditPart;
import crystal.diagram.edit.parts.CollectionsName4EditPart;
import crystal.diagram.edit.parts.CollectionsNameEditPart;
import crystal.diagram.edit.parts.CursorName2EditPart;
import crystal.diagram.edit.parts.CursorName3EditPart;
import crystal.diagram.edit.parts.CursorName4EditPart;
import crystal.diagram.edit.parts.CursorNameEditPart;
import crystal.diagram.edit.parts.DataTypeName2EditPart;
import crystal.diagram.edit.parts.DataTypeName3EditPart;
import crystal.diagram.edit.parts.DataTypeName4EditPart;
import crystal.diagram.edit.parts.DataTypeNameEditPart;
import crystal.diagram.edit.parts.DeleteDescriptionEditPart;
import crystal.diagram.edit.parts.ExceptionDescriptionEditPart;
import crystal.diagram.edit.parts.FetchDescriptionEditPart;
import crystal.diagram.edit.parts.ForDescriptionEditPart;
import crystal.diagram.edit.parts.FunctionNameEditPart;
import crystal.diagram.edit.parts.IfDescriptionEditPart;
import crystal.diagram.edit.parts.InsertDescriptionEditPart;
import crystal.diagram.edit.parts.LoopDescriptionEditPart;
import crystal.diagram.edit.parts.OpenDescriptionEditPart;
import crystal.diagram.edit.parts.ProcedureNameEditPart;
import crystal.diagram.edit.parts.RecordsName2EditPart;
import crystal.diagram.edit.parts.RecordsName3EditPart;
import crystal.diagram.edit.parts.RecordsName4EditPart;
import crystal.diagram.edit.parts.RecordsNameEditPart;
import crystal.diagram.edit.parts.SelectDescriptionEditPart;
import crystal.diagram.edit.parts.UpdateDescriptionEditPart;
import crystal.diagram.edit.parts.WhileDescriptionEditPart;
import crystal.diagram.parsers.MessageFormatParser;
import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class CrystalParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser procedureName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getProcedureName_5022Parser() {
		if (procedureName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getSubprograms_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			procedureName_5022Parser = parser;
		}
		return procedureName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser functionName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getFunctionName_5031Parser() {
		if (functionName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getSubprograms_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			functionName_5031Parser = parser;
		}
		return functionName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser anonymousBlockName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getAnonymousBlockName_5032Parser() {
		if (anonymousBlockName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getSubprograms_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anonymousBlockName_5032Parser = parser;
		}
		return anonymousBlockName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeName_5001Parser() {
		if (dataTypeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5001Parser = parser;
		}
		return dataTypeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionsName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionsName_5002Parser() {
		if (collectionsName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5002Parser = parser;
		}
		return collectionsName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser recordsName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getRecordsName_5003Parser() {
		if (recordsName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5003Parser = parser;
		}
		return recordsName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser cursorName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCursorName_5004Parser() {
		if (cursorName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5004Parser = parser;
		}
		return cursorName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser exceptionDescription_5005Parser;

	/**
	 * @generated
	 */
	private IParser getExceptionDescription_5005Parser() {
		if (exceptionDescription_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5005Parser = parser;
		}
		return exceptionDescription_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifDescription_5006Parser;

	/**
	 * @generated
	 */
	private IParser getIfDescription_5006Parser() {
		if (ifDescription_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5006Parser = parser;
		}
		return ifDescription_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser caseDescription_5007Parser;

	/**
	 * @generated
	 */
	private IParser getCaseDescription_5007Parser() {
		if (caseDescription_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5007Parser = parser;
		}
		return caseDescription_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser insertDescription_5008Parser;

	/**
	 * @generated
	 */
	private IParser getInsertDescription_5008Parser() {
		if (insertDescription_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5008Parser = parser;
		}
		return insertDescription_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateDescription_5009Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateDescription_5009Parser() {
		if (updateDescription_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5009Parser = parser;
		}
		return updateDescription_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser deleteDescription_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDeleteDescription_5010Parser() {
		if (deleteDescription_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5010Parser = parser;
		}
		return deleteDescription_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectDescription_5011Parser;

	/**
	 * @generated
	 */
	private IParser getSelectDescription_5011Parser() {
		if (selectDescription_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5011Parser = parser;
		}
		return selectDescription_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileDescription_5012Parser;

	/**
	 * @generated
	 */
	private IParser getWhileDescription_5012Parser() {
		if (whileDescription_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5012Parser = parser;
		}
		return whileDescription_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser forDescription_5013Parser;

	/**
	 * @generated
	 */
	private IParser getForDescription_5013Parser() {
		if (forDescription_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5013Parser = parser;
		}
		return forDescription_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser loopDescription_5014Parser;

	/**
	 * @generated
	 */
	private IParser getLoopDescription_5014Parser() {
		if (loopDescription_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5014Parser = parser;
		}
		return loopDescription_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser openDescription_5015Parser;

	/**
	 * @generated
	 */
	private IParser getOpenDescription_5015Parser() {
		if (openDescription_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5015Parser = parser;
		}
		return openDescription_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser fetchDescription_5016Parser;

	/**
	 * @generated
	 */
	private IParser getFetchDescription_5016Parser() {
		if (fetchDescription_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5016Parser = parser;
		}
		return fetchDescription_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser closeDescription_5017Parser;

	/**
	 * @generated
	 */
	private IParser getCloseDescription_5017Parser() {
		if (closeDescription_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5017Parser = parser;
		}
		return closeDescription_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser callProcedureDescription_5033Parser;

	/**
	 * @generated
	 */
	private IParser getCallProcedureDescription_5033Parser() {
		if (callProcedureDescription_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5033Parser = parser;
		}
		return callProcedureDescription_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser callFunctionDescription_5034Parser;

	/**
	 * @generated
	 */
	private IParser getCallFunctionDescription_5034Parser() {
		if (callFunctionDescription_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5034Parser = parser;
		}
		return callFunctionDescription_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeName_5018Parser() {
		if (dataTypeName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5018Parser = parser;
		}
		return dataTypeName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionsName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionsName_5019Parser() {
		if (collectionsName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5019Parser = parser;
		}
		return collectionsName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser recordsName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getRecordsName_5020Parser() {
		if (recordsName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5020Parser = parser;
		}
		return recordsName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser cursorName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getCursorName_5021Parser() {
		if (cursorName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5021Parser = parser;
		}
		return cursorName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeName_5023Parser() {
		if (dataTypeName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5023Parser = parser;
		}
		return dataTypeName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionsName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionsName_5024Parser() {
		if (collectionsName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5024Parser = parser;
		}
		return collectionsName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser recordsName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getRecordsName_5025Parser() {
		if (recordsName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5025Parser = parser;
		}
		return recordsName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser cursorName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getCursorName_5026Parser() {
		if (cursorName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5026Parser = parser;
		}
		return cursorName_5026Parser;
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
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
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
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
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
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
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
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE
					.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5030Parser = parser;
		}
		return cursorName_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProcedureNameEditPart.VISUAL_ID:
			return getProcedureName_5022Parser();
		case FunctionNameEditPart.VISUAL_ID:
			return getFunctionName_5031Parser();
		case AnonymousBlockNameEditPart.VISUAL_ID:
			return getAnonymousBlockName_5032Parser();
		case DataTypeNameEditPart.VISUAL_ID:
			return getDataTypeName_5001Parser();
		case CollectionsNameEditPart.VISUAL_ID:
			return getCollectionsName_5002Parser();
		case RecordsNameEditPart.VISUAL_ID:
			return getRecordsName_5003Parser();
		case CursorNameEditPart.VISUAL_ID:
			return getCursorName_5004Parser();
		case ExceptionDescriptionEditPart.VISUAL_ID:
			return getExceptionDescription_5005Parser();
		case IfDescriptionEditPart.VISUAL_ID:
			return getIfDescription_5006Parser();
		case CaseDescriptionEditPart.VISUAL_ID:
			return getCaseDescription_5007Parser();
		case InsertDescriptionEditPart.VISUAL_ID:
			return getInsertDescription_5008Parser();
		case UpdateDescriptionEditPart.VISUAL_ID:
			return getUpdateDescription_5009Parser();
		case DeleteDescriptionEditPart.VISUAL_ID:
			return getDeleteDescription_5010Parser();
		case SelectDescriptionEditPart.VISUAL_ID:
			return getSelectDescription_5011Parser();
		case WhileDescriptionEditPart.VISUAL_ID:
			return getWhileDescription_5012Parser();
		case ForDescriptionEditPart.VISUAL_ID:
			return getForDescription_5013Parser();
		case LoopDescriptionEditPart.VISUAL_ID:
			return getLoopDescription_5014Parser();
		case OpenDescriptionEditPart.VISUAL_ID:
			return getOpenDescription_5015Parser();
		case FetchDescriptionEditPart.VISUAL_ID:
			return getFetchDescription_5016Parser();
		case CloseDescriptionEditPart.VISUAL_ID:
			return getCloseDescription_5017Parser();
		case CallProcedureDescriptionEditPart.VISUAL_ID:
			return getCallProcedureDescription_5033Parser();
		case CallFunctionDescriptionEditPart.VISUAL_ID:
			return getCallFunctionDescription_5034Parser();
		case DataTypeName2EditPart.VISUAL_ID:
			return getDataTypeName_5018Parser();
		case CollectionsName2EditPart.VISUAL_ID:
			return getCollectionsName_5019Parser();
		case RecordsName2EditPart.VISUAL_ID:
			return getRecordsName_5020Parser();
		case CursorName2EditPart.VISUAL_ID:
			return getCursorName_5021Parser();
		case DataTypeName3EditPart.VISUAL_ID:
			return getDataTypeName_5023Parser();
		case CollectionsName3EditPart.VISUAL_ID:
			return getCollectionsName_5024Parser();
		case RecordsName3EditPart.VISUAL_ID:
			return getRecordsName_5025Parser();
		case CursorName3EditPart.VISUAL_ID:
			return getCursorName_5026Parser();
		case DataTypeName4EditPart.VISUAL_ID:
			return getDataTypeName_5027Parser();
		case CollectionsName4EditPart.VISUAL_ID:
			return getCollectionsName_5028Parser();
		case RecordsName4EditPart.VISUAL_ID:
			return getRecordsName_5029Parser();
		case CursorName4EditPart.VISUAL_ID:
			return getCursorName_5030Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
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
