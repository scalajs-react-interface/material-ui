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
 @JSImport("material-ui/Menu","MenuList")
object MuiMenuListComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiMenuList {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onBlur : OptionalParam[ReactEventH => _] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onKeyDown : OptionalParam[ReactEventH => _] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiMenuListComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiMenuListComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiMenuListComponent.type](
      MuiMenuListComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiMenuListC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiMenuListComponent.type](
      MuiMenuListComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         
