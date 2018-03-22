package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/Table","TableCell")
object MuiTableCellComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiTableCell {
    
    @inline
    def apply(checkbox : OptionalParam[Boolean] = OptDefault,
id : OptionalParam[String] = OptDefault,
disablePadding : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
compact : OptionalParam[Boolean] = OptDefault,
numeric : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTableCellComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTableCellComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTableCellComponent.type](
      MuiTableCellComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiTableCellC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTableCellComponent.type](
      MuiTableCellComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         
